package factory;

public class ElectricCar implements Vehicle{

  @Override
  public void startEngine() {
    System.out.println("Starting electric car engine");
  }
}
