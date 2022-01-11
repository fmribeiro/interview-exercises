package vendingMachine2;

public interface VendingMachineState {

  void selectProduct();

  void insertCoin();

  void takeRefund();

  void dispenseProduct();

  void dispenseChange();

  void saveToInventory();

}
