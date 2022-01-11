package vendingMachine2;

public class ProductSoldState implements VendingMachineState {

  private VendingMachine vendingMachine;

  public ProductSoldState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void selectProduct() {
    System.out.println("Product was already selected");
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin was already selected");
  }

  @Override
  public void takeRefund() {
    System.out.println("No refund");
  }

  @Override
  public void dispenseProduct() {
    System.out.println("Product was dispensed already");
  }

  @Override
  public void dispenseChange() {
    System.out.println("Returning change of: " + vendingMachine.getCurrentChange());
    this.vendingMachine.setState(vendingMachine.getNoCoinState());
  }

  @Override
  public void saveToInventory() {
    vendingMachine.getInventory().subtractItemPurchased(vendingMachine.getChoosedProduct());
    this.vendingMachine.setState(vendingMachine.getNoCoinState());
  }
}
