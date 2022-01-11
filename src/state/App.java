package state;

public class App {

  public static void main(String[] args) {
    CandyVendingMachine candyVendingMachine = new CandyVendingMachine(5);
    System.out.println(candyVendingMachine);
    System.out.println("----------------------------------------------------------------------------------");
    candyVendingMachine.insertCoin();
    candyVendingMachine.pressButton();

    candyVendingMachine.insertCoin();
    candyVendingMachine.pressButton();
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(candyVendingMachine);
  }
}
