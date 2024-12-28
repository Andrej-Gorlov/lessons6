package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Количество
public class GetProductQuantityCommand {
    private final Basket basket;
    private final String product;

    public GetProductQuantityCommand(Basket basket, String product) {
        this.basket = basket;
        this.product = product;
    }

    // Количество продуктов.
    public void execute() {
        int quantity = basket.getProductQuantity(product);
        System.out.println("Количество продукта '" + product + "': " + quantity);
    }
}
