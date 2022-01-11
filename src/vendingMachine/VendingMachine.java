package vendingMachine;

public class VendingMachine {

  private final VendingMachineState noCoinState = new NoCoinState(this);
  private final VendingMachineState returnProductState = new ReturnProductState(this);
  private final VendingMachineState returnChangeState = new ReturnChangeState(this);
  private final VendingMachineState selectProductState = new SelectProductState(this);
  private final boolean isRefundRequested = false;
  private final int currentBalance = 0;
  private final Inventory inventory = new Inventory();
  private VendingMachineState state;
  private int currentChange = 0;
  private Products choosedProduct;

  public VendingMachine() {
    if (choosedProduct == null) {
      state = selectProductState;
    }
  }

  public void startMachine() {
    do {
      state.selectProduct();
      state.insertCoin();
      state.returnProduct();

      if (currentChange > 0) {
        state = returnChangeState;
        state.returnChange();
      }

      if (isRefundRequested) {
//      refund();
      }
    } while (true);
  }

  public void administrativeFunctions(int id) {
    if (id == 101) {
      inventory.printInventory();
    } else if (id == 102) {
      inventory.refill();
    }
  }

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public Products getChoosedProduct() {
    return choosedProduct;
  }

  public void setChoosedProduct(Products choosedProduct) {
    this.choosedProduct = choosedProduct;
  }

  public int getCurrentChange() {
    return currentChange;
  }

  public void setCurrentChange(int currentChange) {
    this.currentChange = currentChange;
  }

  public VendingMachineState getNoCoinState() {
    return noCoinState;
  }

  public VendingMachineState getReturnProductState() {
    return returnProductState;
  }

  public VendingMachineState getSelectProductState() {
    return selectProductState;
  }

  public Inventory getInventory() {
    return inventory;
  }

  @Override
  public String toString() {
    return "VendingMachine{" +
      "currentState=" + state +
      ", balance=" + currentBalance +
      '}';
  }
}
