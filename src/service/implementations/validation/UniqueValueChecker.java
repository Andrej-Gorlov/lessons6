package service.implementations.validation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueValueChecker {

    /**
     * Проверка уникальности значений.
     *
     * @param map Проверяемый объект.
     * @return true уникальны, false иначе.
     * @throws IllegalArgumentException Равен null или содержит значение null.
     * @throws ClassCastException Значения не могут быть добавлены в HashSet.
     * @throws RuntimeException Непредвиденная ошибка.
     */
    public boolean isUnique(Map<String, String> map) {
        if (map == null) {
            throw new IllegalArgumentException("Объект не должен быть null");
        }

        if (map.isEmpty()) {
            return true;
        }

        Set<String> uniqueValues = new HashSet<>();
        try {
            for (String value : map.values()) {
                if (value == null) {
                    throw new IllegalArgumentException("Значение не должно быть null");
                }
                if (!uniqueValues.add(value)) {
                    return false;
                }
            }
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Ошибка приведения типа значений", e);
        } catch (Exception e) {
            throw new RuntimeException("Произошла непредвиденная ошибка", e);
        }

        return true;
    }
}
