package vendingMachine;

import java.util.Arrays;
import java.util.Scanner;

public class NoCoinState implements VendingMachineState {

  private final VendingMachine vendingMachine;

  public NoCoinState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
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
      currentBalance = currentBalance + typedValue;
    } while (currentBalance < vendingMachine.getChoosedProduct().getPrice());

    vendingMachine.setCurrentChange(currentBalance - vendingMachine.getChoosedProduct().getPrice());
    vendingMachine.setState(vendingMachine.getReturnProductState());
  }

  @Override
  public void selectProduct() {
    System.out.println("Product already inserted");
  }

  @Override
  public void returnProduct() {
    System.out.println("No coin was inserted");
  }

  @Override
  public void returnChange() {
    System.out.println("No coin was inserted");
  }

  @Override
  public void refund() {
    System.out.println("No coin was inserted");
  }

  @Override
  public String toString() {
    return "NoCoinState";
  }
}
