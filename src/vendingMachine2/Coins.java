package vendingMachine2;

public enum Coins {
  PENNY(1),
  NICKEL(5),
  DIME(10),
  QUARTER(25);

  private final int value;

  public static Coins byValue(int value) {
    for (Coins coin : Coins.values()) {
      if (coin.getValue() == value) {
        return coin;
      }
    }
    return null;
  }

  Coins(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
