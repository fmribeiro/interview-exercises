package vendingMachine2;

public class HasCoinState implements VendingMachineState {

  private VendingMachine vendingMachine;

  public HasCoinState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void selectProduct() {
    System.out.println("Product was selected already");
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin was inserted already");
  }

  @Override
  public void takeRefund() {
    System.out.println("Returning your money...");
  }

  @Override
  public void dispenseProduct() {
    System.out.println("Dispensing product: " + vendingMachine.getChoosedProduct());
    vendingMachine.setState(vendingMachine.getProductSoldState());
  }

  @Override
  public void dispenseChange() {
    System.out.println("Dispensing change...");
  }

  @Override
  public void saveToInventory() {
    System.out.println("Product not sold yet");
  }
}
