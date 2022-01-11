package remoteControl;

public class RemoteControl {

  public static RemoteControl GET_INSTANCE = new RemoteControl();
  private Device device;

  private RemoteControl() {
  }

  public void chooseDevice(Device device) {
    this.device = device;
  }

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }
}
