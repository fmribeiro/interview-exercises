package vendingMachine;

import java.util.Arrays;
import java.util.Scanner;

public class SelectProductState implements VendingMachineState {

  private final VendingMachine vendingMachine;

  public SelectProductState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Please select a product first");
  }

  @Override
  public void selectProduct() {
    System.out.println("--------------------------------------------------------------");
    System.out.println("Please select a product:");
    System.out.println("ID  Product  Price Qtty");
    Arrays.stream(Products.values()).forEach(product -> {
      System.out.println(product.getId() + " - " + product + " - $." + product.getPrice() + " - (" + vendingMachine.getInventory().getProductQuantity(product) + ")");
    });

    Scanner scanner = new Scanner(System.in);
    int typedValue;
    Products choosedProduct;
    do {
      typedValue = scanner.nextInt();
      choosedProduct = Products.byId(typedValue);

      if (isAdministractiveFunction(typedValue)) {
        vendingMachine.administrativeFunctions(typedValue);
      } else {
        if (choosedProduct == null) {
          System.out.println("Product not found. Type the correct ID!!!");
        }
        if (choosedProduct != null && vendingMachine.getInventory().getProductQuantity(choosedProduct) < 1) {
          System.out.println("SOLD OUT!!! Choose another product");
          choosedProduct = null;
        }
      }

    } while (choosedProduct == null);

    System.out.println("Choosed Product: " + choosedProduct);
    vendingMachine.setChoosedProduct(choosedProduct);
    vendingMachine.setState(vendingMachine.getNoCoinState());
  }

  private boolean isAdministractiveFunction(int id) {
    return id > 100;
  }

  @Override
  public void returnProduct() {
    System.out.println("Please pay to the product first");
  }

  @Override
  public void returnChange() {
    System.out.println("No change to return");
  }

  @Override
  public void refund() {
    System.out.println("No refund to return");
  }
}
