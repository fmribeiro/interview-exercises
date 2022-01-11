package observer.coffeshop;

public interface ISubject {

  void registerObserver(WaitingCustomer observer);

  void removeObserver(WaitingCustomer observer);

//  void notifyObservers();
}
