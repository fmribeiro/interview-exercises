package vendingMachine;

public class ReturnProductState implements VendingMachineState {

  private final VendingMachine vendingMachine;

  public ReturnProductState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Coin was insert already");
  }

  @Override
  public void selectProduct() {
    System.out.println("Product was inserted already");
  }

  @Override
  public void returnProduct() {
    System.out.println("Returning product: " + vendingMachine.getChoosedProduct());
    vendingMachine.setState(vendingMachine.getSelectProductState());
    vendingMachine.getInventory().subtractItemPurchased(vendingMachine.getChoosedProduct());
  }

  @Override
  public void returnChange() {
    System.out.println("Error. Returning the product");
  }

  @Override
  public void refund() {
    System.out.println("Error. Returning the product");
  }

  @Override
  public String toString() {
    return "ReturnProductState";
  }
}
