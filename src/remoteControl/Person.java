package remoteControl;

public class Person {

  public static void main(String[] args) {
    Device device = new SurroundSoundSystem();
    RemoteControl remoteControl = RemoteControl.GET_INSTANCE;
    remoteControl.chooseDevice(device);
    remoteControl.turnOn();
    remoteControl.turnOff();
  }
}
