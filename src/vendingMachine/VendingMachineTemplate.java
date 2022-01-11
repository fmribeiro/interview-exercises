package vendingMachine;

public abstract class VendingMachineTemplate {

  protected VendingMachineState state;
  protected int currentChange = 0;
  protected int currentBalance = 0;
  protected boolean isRefundRequested = false;
  protected Products choosedProduct;

  public void startMachine() {
    do {
      state.selectProduct();
      state.insertCoin();
      state.returnProduct();

      if (currentChange > 0) {
        state.returnChange();
      }

      if (isRefundRequested) {
        state.refund();
      }
    } while (true);
  }

  public VendingMachineState getState() {
    return state;
  }

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public int getCurrentChange() {
    return currentChange;
  }

  public void setCurrentChange(int currentChange) {
    this.currentChange = currentChange;
  }

  public int getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(int currentBalance) {
    this.currentBalance = currentBalance;
  }

  public Products getChoosedProduct() {
    return choosedProduct;
  }

  public void setChoosedProduct(Products choosedProduct) {
    this.choosedProduct = choosedProduct;
  }
}
