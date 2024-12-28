package service.implementations.orderCart;

import service.interfaces.shoppingCart.Basket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket {
    private final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество должно быть положительным.");
        }
        products.merge(product, quantity, Integer::sum);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным.");
        }
        if (products.containsKey(product)) {
            products.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
