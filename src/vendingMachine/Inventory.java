package vendingMachine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Inventory {

  //cada produto inicia com 10 itens
  //subtrair um item a cada compra
  private final Map<Products, Integer> products = new HashMap<>();
  private final Map<Products, Integer> productsSold = new HashMap<>();

  public Inventory() {
    initialState();
  }

  //inicia cada produto com 10 itens
  private void initialState() {
    Arrays.stream(Products.values()).forEach(product -> {
      products.put(product, 5);
    });
  }

  public void subtractItemPurchased(Products product) {
    Integer quantity = products.get(product);
    quantity--;
    products.put(product, quantity);

    addItemToItemsSoldInventory(product);

  }

  private void addItemToItemsSoldInventory(Products product) {
    if (productsSold.get(product) == null) {
      productsSold.put(product, 1);
    } else {
      int totalItems = productsSold.get(product);
      totalItems++;
      productsSold.put(product, totalItems);
    }
  }

  public Integer getProductQuantity(Products product) {
    return products.get(product);
  }

  public void refill() {
    System.out.println("Starting refill all the products");
    initialState();
  }

  public void printInventory() {
    System.out.println("\nPrinting inventory...");
    System.out.println("Product Qtty Total");
    AtomicInteger totalSold = new AtomicInteger();
    AtomicInteger totalItems = new AtomicInteger();

    productsSold.forEach((product, qtty) -> {
      int total = product.getPrice() * qtty;
      totalSold.set(totalSold.get() + total);
      totalItems.set(totalItems.get() + qtty);
      System.out.println(product + " " + qtty + " " + total);
    });

    System.out.println("--------------------");
    System.out.println(totalItems.get() + " items ");
    System.out.println("Total: $" + totalSold.get());
  }
}
