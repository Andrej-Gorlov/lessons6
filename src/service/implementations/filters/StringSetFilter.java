package service.implementations.filters;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSetFilter {

    /**
     * Удаление строк четной длины.
     *
     * @param set набор строк.
     * @return набор строк с нечетной длиной.
     * @throws NullPointerException передан null.
     * @throws ClassCastException не являются строками.
     * @throws IllegalArgumentException содержит недопустимые элементы.
     */
    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> resultSet = new HashSet<>();

        try {
            resultSet = set.stream()
                    .filter(str -> {
                        if (str == null) {
                            return false;
                        }
                        return str.length() % 2 != 0;
                    })
                    .collect(Collectors.toSet());
        } catch (NullPointerException e) {
            System.err.println("Ошибка: значение null. " + e.getMessage());
        } catch (ClassCastException e) {
            System.err.println("Ошибка: Неверный тип. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: Неверные аргументы. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }

        return resultSet;
    }
}
