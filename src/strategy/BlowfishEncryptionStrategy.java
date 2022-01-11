package strategy;

public class BlowfishEncryptionStrategy implements EncryptionStrategy{

  @Override
  public void encriptData(String text) {
    System.out.println("Encrypting  using BlowfishEncryptionStrategy");
  }
}
