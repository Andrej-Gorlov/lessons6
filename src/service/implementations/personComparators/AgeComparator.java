package service.implementations.personComparators;

import domain.Person;
import service.interfaces.comparators.PersonComparator;
import java.util.Comparator;

public class AgeComparator implements PersonComparator {

    /**
     * Сравнение двух объектов типа Person по возрасту.
     *
     * @param person1 первый объект
     * @param person2 второй объект
     * @return отрицательное число, p1 меньше p2,
     *         положительное число, p1 больше p2,
     *         ноль равны
     */
    @Override
    public int compare(Person person1, Person person2) {
        return Comparator.comparing(Person::age, Comparator.nullsLast(Integer::compare)).compare(person1, person2);
    }
}