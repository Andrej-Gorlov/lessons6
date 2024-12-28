package service.interfaces.shoppingCart;

import java.util.List;

public interface Basket {
    /**
     * Добавление продукта.
     *
     * @param product наименование продукта
     * @param quantity количество продукта
     */
    void addProduct(String product, int quantity);

    /**
     * Удаление продукта.
     *
     * @param product наименование продукта
     */
    void removeProduct(String product);

    /**
     * Обновляет количество продукта.
     *
     * @param product наименование продукта
     * @param quantity количество продукта
     */
    void updateProductQuantity(String product, int quantity);


    // Очищение корзины.
    void clear();

    /**
     * Список продуктов.
     *
     * @return список наименований продуктов
     */
    List<String> getProducts();

    /**
     * Количество указанного продукта.
     *
     * @param product наименование продукта
     * @return количество продукта
     */
    int getProductQuantity(String product);
}
