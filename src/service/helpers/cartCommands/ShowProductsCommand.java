package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Отображение
public class ShowProductsCommand {
    private final Basket basket;

    public ShowProductsCommand(Basket basket) {
        this.basket = basket;
    }

    // Отображение в корзине.
    public void execute() {
        System.out.println("Товары в корзине: " + basket.getProducts());
    }
}
