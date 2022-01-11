package factory;

public class Car implements Vehicle{

  @Override
  public void startEngine() {
    System.out.println("Starting car's engine");
  }
}
