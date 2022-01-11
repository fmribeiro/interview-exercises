package vendingMachine2;

import java.util.Arrays;
import java.util.Scanner;

public class NoCoinState implements VendingMachineState {

  private final VendingMachine vendingMachine;

  public NoCoinState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
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

//      if (isAdministractiveFunction(typedValue)) {
//        vendingMachine.administrativeFunctions(typedValue);
//      } else {
      if (choosedProduct == null) {
        System.out.println("Product not found. Type the correct ID!!!");
      }
      if (choosedProduct != null && vendingMachine.getInventory().getProductQuantity(choosedProduct) < 1) {
        System.out.println("SOLD OUT!!! Choose another product");
        choosedProduct = null;
      }
//      }

    } while (choosedProduct == null);

    System.out.println("Choosed Product: " + choosedProduct);
    vendingMachine.setChoosedProduct(choosedProduct);
  }

  @Override
  public void insertCoin() {
    System.out.println("\nPlease insert a coin:");
    Arrays.stream(Coins.values()).forEach(coins -> System.out.println(coins + " - " + coins.getValue()));
    System.out.println("Insert enough coin to pay the product");

    Scanner scanner = new Scanner(System.in);
    int typedValue;
    int currentBalance = 0;
    do {
      typedValue = scanner.nextInt();
      if (Coins.byValue(typedValue) == null) {
        System.out.println("Please insert a valid coin");
        System.out.println("Ejecting coin...");
      } else {
        currentBalance = currentBalance + typedValue;
      }
      System.out.println("Balance: " + currentBalance);
    } while (currentBalance < vendingMachine.getChoosedProduct().getPrice());

    vendingMachine.setCurrentChange(currentBalance - vendingMachine.getChoosedProduct().getPrice());
    vendingMachine.setState(vendingMachine.getHasCoinState());
  }

  @Override
  public void takeRefund() {
    System.out.println("No coin was inserted");
  }

  @Override
  public void dispenseProduct() {
    System.out.println("No coin was inserted");
  }

  @Override
  public void dispenseChange() {
    System.out.println("No coin was inserted");
  }

  @Override
  public void saveToInventory() {
    System.out.println("Product not sold yet");
  }

  private boolean isAdministractiveFunction(int id) {
    return id > 100;
  }

}
