package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Добавление
public class AddProductCommand {
    private final Basket basket;
    private final String product;
    private final int quantity;

    public AddProductCommand(Basket basket, String product, int quantity) {
        this.basket = basket;
        this.product = product;
        this.quantity = quantity;
    }

    //добавление в корзину.
    public void execute() {
        basket.addProduct(product, quantity);
    }
}
