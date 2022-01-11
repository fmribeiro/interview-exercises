package vendingMachine;

public interface VendingMachineState {
  void insertCoin();
  void selectProduct();
  void returnProduct();
  void returnChange();
  void refund();
}
