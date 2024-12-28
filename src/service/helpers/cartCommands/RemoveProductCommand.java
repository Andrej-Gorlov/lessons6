package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Удаление
public class RemoveProductCommand {
    private final Basket basket;
    private final String product;

    public RemoveProductCommand(Basket basket, String product) {
        this.basket = basket;
        this.product = product;
    }

    //Удаление корзины.
    public void execute() {
        basket.removeProduct(product);
    }
}
