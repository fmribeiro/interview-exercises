package strategy;

public class AesEncryptionStrategy implements EncryptionStrategy{

  @Override
  public void encriptData(String text) {
    System.out.println("Encrypting  using AesEncryptionStrategy");
  }
}
