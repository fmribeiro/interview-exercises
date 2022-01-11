package vendingMachine2;

public class VendingMachine {

  private final VendingMachineState noCoinState;
  private final VendingMachineState hasCoinState;
  private final VendingMachineState productSoldState;
  private VendingMachineState state;
  private final Inventory inventory;
  private Products choosedProduct;
  private int currentChange = 0;
  private boolean isRefundRequested = false;

  public VendingMachine() {
    this.noCoinState = new NoCoinState(this);
    this.hasCoinState = new HasCoinState(this);
    this.productSoldState = new ProductSoldState(this);
    this.inventory = new Inventory();
    this.state = noCoinState;
  }

  public void startMachine() {
    do {
      state.selectProduct();
      state.insertCoin();
      state.dispenseProduct();
      state.saveToInventory();

      if (currentChange > 0) {
        this.state = productSoldState;
        state.dispenseChange();
      }

      if (isRefundRequested) {
//        state.takeRefund();
      }
    } while (true);
  }

  public VendingMachineState getNoCoinState() {
    return noCoinState;
  }

  public VendingMachineState getHasCoinState() {
    return hasCoinState;
  }

  public VendingMachineState getProductSoldState() {
    return productSoldState;
  }

  public VendingMachineState getState() {
    return state;
  }

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public Inventory getInventory() {
    return inventory;
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
}
