package observer.coffeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {

  private final List<WaitingCustomer> customerList = new ArrayList<>();
  private final List<String> completedDrinks = new ArrayList<>();

  public void takeOrder(WaitingCustomer customer) {
    customerList.add(customer);
    System.out.println("Taking " + customer.getName() + "'s order: " + customer.getDrinkOrdered());
  }

  public void prepareDrink(String drinkToPrepare) {
    System.out.println("Preparing drink: " + drinkToPrepare);
    this.completedDrinks.add(drinkToPrepare);
  }

  public void callOutCompletedOrder() {
    completedDrinks.forEach(drink -> {
      customerList.forEach(customer -> {
        customer.orderReady(drink);
      });
    });

    completedDrinks.clear();
    customerList.clear();
  }
}
