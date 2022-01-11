package remoteControl;

public class Projector implements Device{

  public void turnOn(){
    System.out.println("Turning on Projector");
  }

  public void turnOff() {
    System.out.println("Turning off Projector");
  }
}
