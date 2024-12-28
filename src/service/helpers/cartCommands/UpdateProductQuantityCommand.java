package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Обновление количества
public class UpdateProductQuantityCommand {
    private final Basket basket;
    private final String product;
    private final int quantity;

    public UpdateProductQuantityCommand(Basket basket, String product, int quantity) {
        this.basket = basket;
        this.product = product;
        this.quantity = quantity;
    }

    // Обновление количества продукта.
    public void execute() {
        basket.updateProductQuantity(product, quantity);
        System.out.println("Количество продукта '" + product + "' обновлено до " + quantity);
    }
}
