package observer.coffeshop;

public interface WaitingCustomer {

  void orderReady(String preparedDrink);

  String getName();

  String getDrinkOrdered();
}
