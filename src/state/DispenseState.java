package state;

public class DispenseState implements VendingMachineState {

  private CandyVendingMachine vendingMachine;

  public DispenseState(CandyVendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Error. System is currently dispensing");
  }

  @Override
  public void pressButton() {
    System.out.println("Error. System is currently dispensing");
  }

  @Override
  public void dispense() {
    vendingMachine.dispenseCandy();
    if (vendingMachine.getCount() == 0) {
      System.out.println("No candies available");
      vendingMachine.setState(vendingMachine.getNoCandyState());
    } else {
      vendingMachine.setState(vendingMachine.getNoCoinState());
    }
  }

  @Override
  public String toString() {
    return "DispenseState";
  }
}
