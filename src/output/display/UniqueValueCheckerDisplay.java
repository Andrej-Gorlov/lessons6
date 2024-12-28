package output.display;

import service.implementations.validation.UniqueValueChecker;
import java.util.Map;

public class UniqueValueCheckerDisplay {

    // Отображение проверки на уникальность.
    public static void display() {
        System.out.println("\nВыполнение проверки на дублирующее значение:");

        UniqueValueChecker checker = new UniqueValueChecker();

        Map<String, String> map1 = Map.of(
                "Вася", "Иванов",
                "Петр", "Петров",
                "Виктор", "Сидоров",
                "Сергей", "Савельев",
                "Вадим", "Викторов"
        );
        displayMapAndCheckUniqueness(map1, checker);

        Map<String, String> map2 = Map.of(
                "Вася", "Иванов",
                "Петр", "Петров",
                "Виктор", "Иванов",
                "Сергей", "Савельев",
                "Вадим", "Викторов"
        );
        displayMapAndCheckUniqueness(map2, checker);

        Map<String, String> map3 = Map.of();
        displayMapAndCheckUniqueness(map3, checker);
    }

    /**
     * Отображение значений и проверки.
     *
     * @param map Проверяемый объект.
     * @param checker Объект проверки уникальности
     */
    private static void displayMapAndCheckUniqueness(Map<String, String> map, UniqueValueChecker checker) {
        System.out.println("\nЗначения:");
        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nРезультат проверки: значения " + (checker.isUnique(map) ? "уникальные" : "не уникальные"));
    }
}
