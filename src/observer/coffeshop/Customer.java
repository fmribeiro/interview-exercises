package observer.coffeshop;

public class Customer implements WaitingCustomer {

  private final String name;
  private final String drinkOrdered;

  public Customer(String name, String drinkOrdered) {
    this.name = name;
    this.drinkOrdered = drinkOrdered;
  }

  @Override
  public void orderReady(String preparedDrink) {
    if (preparedDrink.equals(drinkOrdered)) {
      System.out.println(this.name + " your " + preparedDrink + " was prepared!!!");
    }
  }

  public String getName() {
    return name;
  }

  public String getDrinkOrdered() {
    return drinkOrdered;
  }
}
