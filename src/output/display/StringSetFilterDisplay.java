package output.display;

import java.util.Set;
import static service.implementations.filters.StringSetFilter.removeEvenLength;

public class StringSetFilterDisplay {
    // Отображение удаления строк четной длины.
    public static void display() {
        System.out.println("\nВыполнение удаления строк четной длины:");

        Set<String> inputSet = Set.of("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        System.out.println("\nНачальные значения:");
        System.out.println(inputSet);

        Set<String> resultSet = removeEvenLength(inputSet);
        System.out.println("\nпосле удаления:");
        System.out.println(resultSet); // Вывод: [foo, bar, spoon, !]
    }
}
