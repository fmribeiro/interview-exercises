package factory;

public class Truck implements Vehicle{

  @Override
  public void startEngine() {
    System.out.println("Starting truck's engine");
  }
}
