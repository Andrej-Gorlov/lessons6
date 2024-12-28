package output.display;

import domain.Person;
import service.implementations.personComparators.AgeComparator;
import service.implementations.personComparators.NameComparator;
import service.implementations.personComparators.PersonSuperComparator;

import java.util.List;

public class PersonSortingDisplay {

    // Отображение взаимодействия с сортировкой по возрасту и имени
    public static void display() {
        System.out.println("\nВыполнение сортировки объектов:");

        var peoples = List.of(
                new Person(33, "Андрей"),
                new Person(42, "Александр"),
                new Person(3, "Сергей"),
                new Person(38, "Андрей"),
                new Person(33, "Александр")
        );

        System.out.println("\nИсходный список людей:");
        printPeople(peoples);

        sortAndPrint(peoples, new PersonSuperComparator(List.of(new AgeComparator(), new NameComparator())),
                "Отсортированный список людей: (сначала по возрасту, затем по имени)");

        sortAndPrint(peoples, new PersonSuperComparator(List.of(new NameComparator(), new AgeComparator())),
                "Отсортированный список людей: (сначала по имени, затем по возрасту)");
    }

    /**
     * Сортировка и вывод на экран
     *
     * @param peoples список людей
     * @param comparator компаратор
     * @param title заголовок
     */
    private static void sortAndPrint(List<Person> peoples, PersonSuperComparator comparator, String title) {
        var sortedPeoples = peoples.stream()
                .sorted(comparator)
                .toList(); // Сохраняем отсортированный список

        System.out.println("\n" + title);
        printPeople(sortedPeoples);
    }

    /**
     * Вывод на экран
     *
     * @param peoples список людей
     */
    private static void printPeople(List<Person> peoples) {
        peoples.forEach(person ->
                System.out.println("Имя: " + person.name() + " | Возраст: " + person.age())
        );
    }
}
