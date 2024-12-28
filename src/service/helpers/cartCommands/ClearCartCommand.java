package service.helpers.cartCommands;

import service.interfaces.shoppingCart.Basket;

// Чистка
public class ClearCartCommand {
    private final Basket basket;

    public ClearCartCommand(Basket basket) {
        this.basket = basket;
    }


    // Очистка корзины.
    public void execute() {
        basket.clear();
        System.out.println("Корзина очищена.");
    }
}
