package state;

public class NoCoinState implements VendingMachineState {

  private final CandyVendingMachine vendingMachine;

  public NoCoinState(CandyVendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    vendingMachine.setState(vendingMachine.getContainsCoinState());
  }

  @Override
  public void pressButton() {
    System.out.println("No coin inserted");
  }

  @Override
  public void dispense() {
    System.out.println("No coin inserted");
  }

  @Override
  public String toString() {
    return "NoCoinState";
  }
}
