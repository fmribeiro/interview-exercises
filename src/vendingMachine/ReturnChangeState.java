package vendingMachine;

public class ReturnChangeState implements VendingMachineState {

  private final VendingMachine vendingMachine;

  public ReturnChangeState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin was insert already");
  }

  @Override
  public void selectProduct() {
    System.out.println("Error. Returning change");
  }

  @Override
  public void returnProduct() {
    System.out.println("Error. Returning change");
  }

  @Override
  public void returnChange() {
    System.out.println("Returning change of: " + vendingMachine.getCurrentChange());
    this.vendingMachine.setState(vendingMachine.getSelectProductState());
  }

  @Override
  public void refund() {
    System.out.println("No refund to make");
  }

  @Override
  public String toString() {
    return "ReturnChangeState";
  }
}
