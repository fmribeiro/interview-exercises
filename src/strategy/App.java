package strategy;

public class App {

  public static void main(String[] args) {
    EncryptionStrategy aesEncryptionStrategy = new AesEncryptionStrategy();
    Encryptor encryptor = new Encryptor(aesEncryptionStrategy);
    encryptor.setPlainText("text to encrypt");
    encryptor.encrypt();

    EncryptionStrategy blowfishEncryptionStrategy = new BlowfishEncryptionStrategy();
    encryptor = new Encryptor(blowfishEncryptionStrategy);
    encryptor.setPlainText("text to encrypt");
    encryptor.encrypt();
  }
}
