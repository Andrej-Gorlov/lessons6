package output.display;

import service.implementations.orderCart.ShoppingCart;
import service.implementations.orderCart.ShoppingCartFacade;
import service.interfaces.shoppingCart.Basket;

public class ShoppingCartDisplay {

    // Отображение взаимодействия с корзиной покупок.
    public static void display() {
        System.out.println("\nВыполнение корзины интернет магазина:");

        Basket shoppingCart = new ShoppingCart();
        ShoppingCartFacade facade = new ShoppingCartFacade(shoppingCart);

        String mandarin = "Мандарин";
        String pineapple = "Ананас";

        System.out.println("\nДобавляем в корзину 10 мандаринов и 3 ананаса.");
        facade.addProduct(mandarin, 5);
        facade.addProduct(pineapple, 3);
        displayProductQuantities(facade, mandarin, pineapple);
        facade.showProducts();

        System.out.println("\nДобавим ещё 5 мандаринов");
        facade.addProduct(mandarin, 5);
        displayProductQuantities(facade, mandarin, pineapple);

        System.out.println("\nОбновляем количество мандаринов на 20");
        facade.updateProductQuantity(mandarin, 20);
        displayProductQuantities(facade, mandarin, pineapple);

        System.out.println("\nУбираем ананас");
        facade.removeProduct(pineapple);
        displayProductQuantities(facade, mandarin, pineapple);

        facade.showProducts();

        System.out.println("\nОчистка корзины.");
        facade.clearCart();
        facade.showProducts();
    }

    /**
     * Количество продуктов в корзине.
     *
     * @param cart Корзина.
     * @param products Массив строк (названия продуктов).
     */
    private static void displayProductQuantities(ShoppingCartFacade cart, String... products) {
        for (String product : products) {
            cart.getProductQuantity(product);
        }
    }
}
