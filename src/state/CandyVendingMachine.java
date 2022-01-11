package state;

public class CandyVendingMachine {

  private final VendingMachineState noCandyState = new NoCandyState(this);
  private final VendingMachineState noCoinState = new NoCoinState(this);
  private final VendingMachineState containsCoinState = new ContainsCoinState(this);
  private final VendingMachineState dispenseState = new DispenseState(this);

  private VendingMachineState currentState;
  private int count;

  public CandyVendingMachine(int numberOfCandies) {
    count = numberOfCandies;
    if (count > 0) {
      currentState = noCoinState;
    }
  }

  public void insertCoin() {
    System.out.println("You inserted a coin");
    currentState.insertCoin();
  }

  public void pressButton() {
    System.out.println("You have pressed the button");
    currentState.pressButton();
    currentState.dispense();
  }

  public void setState(VendingMachineState vendingMachineState) {
    this.currentState = vendingMachineState;
  }

  public VendingMachineState getNoCandyState() {
    return noCandyState;
  }

  public VendingMachineState getNoCoinState() {
    return noCoinState;
  }

  public VendingMachineState getContainsCoinState() {
    return containsCoinState;
  }

  public VendingMachineState getDispenseState() {
    return dispenseState;
  }

  public int getCount() {
    return count;
  }

  public void dispenseCandy() {
    if (count > 0) {
      count = count - 1;
    }
  }

  @Override
  public String toString() {
    return "CandyVendingMachine{" +
      "currentState=" + currentState +
      ", count=" + count +
      '}';
  }
}
