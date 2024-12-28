package service.implementations.orderCart;

import service.helpers.cartCommands.*;
import service.interfaces.shoppingCart.Basket;

// Взаимодействие с корзиной
public class ShoppingCartFacade {
    private final Basket basket;

    public ShoppingCartFacade(Basket basket) {
        this.basket = basket;
    }

    /**
     * Добавление в корзину.
     *
     * @param product  название продукта
     * @param quantity количество продукта
     */
    public void addProduct(String product, int quantity) {
        new AddProductCommand(basket, product, quantity).execute();
    }

    /**
     * Удаление из корзины.
     *
     * @param product название продукта
     */
    public void removeProduct(String product) {
        new RemoveProductCommand(basket, product).execute();
    }


    // Продукты корзины.
    public void showProducts() {
        new ShowProductsCommand(basket).execute();
    }


    // Очистка корзины.
    public void clearCart() {
        new ClearCartCommand(basket).execute();
    }

    /**
     * Обновление количества в корзине.
     *
     * @param product  название продукта
     * @param quantity новое количество продукта
     */
    public void updateProductQuantity(String product, int quantity) {
        new UpdateProductQuantityCommand(basket, product, quantity).execute();
    }

    /**
     *  Количество в корзине.
     *
     * @param product название продукта
     */
    public void getProductQuantity(String product) {
        new GetProductQuantityCommand(basket, product).execute();
    }
}
