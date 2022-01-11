package observer.coffeshop;

public class CoffeeShop {

  public static void main(String[] args) {
    WaitingCustomer lucas = new Customer("Lucas", "double coffee");
    WaitingCustomer maria = new Customer("Maria", "Oriental Tea");
    WaitingCustomer brenda = new Customer("Brenda", "coffee");
    WaitingCustomer sarah = new Customer("Sarah", "milk tea");

    CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
    coffeeAttendent.takeOrder(lucas);
    coffeeAttendent.takeOrder(maria);

    coffeeAttendent.prepareDrink(lucas.getDrinkOrdered());
    coffeeAttendent.prepareDrink(maria.getDrinkOrdered());

    coffeeAttendent.callOutCompletedOrder();

    //-------------------------------------------------------------------------------------------------

    coffeeAttendent.takeOrder(brenda);
    coffeeAttendent.takeOrder(sarah);

    coffeeAttendent.prepareDrink(brenda.getDrinkOrdered());
    coffeeAttendent.prepareDrink(sarah.getDrinkOrdered());

    coffeeAttendent.callOutCompletedOrder();
  }
}
