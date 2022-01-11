package state;

public class ContainsCoinState implements VendingMachineState {

  private CandyVendingMachine vendingMachine;

  public ContainsCoinState(CandyVendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin already inserted");
  }

  @Override
  public void pressButton() {
    vendingMachine.setState(vendingMachine.getDispenseState());
  }

  @Override
  public void dispense() {
    System.out.println("Press button to dispense");
  }

  @Override
  public String toString() {
    return "ContainsCoinState";
  }
}
