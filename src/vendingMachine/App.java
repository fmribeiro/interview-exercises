package vendingMachine;

public class App {

  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    System.out.println(vendingMachine);
    vendingMachine.startMachine();

    System.out.println(vendingMachine);
  }

}
