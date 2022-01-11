package state;

public class NoCandyState implements VendingMachineState {

  private final CandyVendingMachine vendingMachine;

  public NoCandyState(CandyVendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("No candies available");
  }

  @Override
  public void pressButton() {
    System.out.println("No candies available");
  }

  @Override
  public void dispense() {
    System.out.println("No candies available");
  }

  @Override
  public String toString() {
    return "NoCandyState";
  }
}


