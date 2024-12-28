package service.implementations.personComparators;

import domain.Person;
import service.interfaces.comparators.PersonComparator;
import java.util.List;
import java.util.Optional;

// Наименование класса CompositePersonComparator могло бы быть более подходящим.
public class PersonSuperComparator implements PersonComparator {
    private final List<PersonComparator> comparators;

    public PersonSuperComparator(List<PersonComparator> comparators) {
        this.comparators = Optional.ofNullable(comparators)
                .orElseThrow(() -> new IllegalArgumentException("Список PersonComparator не может быть пустым\n"));
    }

    /**
     * Сравнивает двух объектов типа Person.
     *
     * @param person1 первый объект
     * @param person2 второй объект
     * @return отрицательное число, p1 меньше p2,
     *         положительное число, p1 больше p2,
     *         ноль равны
     * @throws IllegalArgumentException если один из объектов person1 или person1 равен null
     */
    @Override
    public int compare(Person person1, Person person2) {
        if (person1 == null || person2 == null) {
            throw new IllegalArgumentException("Сравнение объекта Person не может быть равно null.");
        }

        try {
            return comparators.stream()
                    .map(comparator -> {
                        try {
                            return comparator.compare(person1, person2);
                        } catch (Exception e) {
                            System.err.println("Ошибка при сравнении: " + e.getMessage());
                            return 0; // Возвращаем 0 в случае ошибки
                        }
                    })
                    .filter(result -> result != 0)
                    .findFirst()
                    .orElse(0); // Возвращаем 0, если все компараторы вернули равенство
        } catch (Exception e) {
            // Обработка исключений, которые могут возникнуть вне потока
            System.err.println("Ошибка при обработке Comparator: " + e.getMessage());
            return 0; // Возвращаем 0 в случае ошибки
        }
    }
}
