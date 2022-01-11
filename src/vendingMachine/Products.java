package vendingMachine;

public enum Products {
  COKE(1, 25),
  PEPSI(2, 35),
  SODA(3, 45);

  private final int id;
  private final int price;

  Products(int id, int price) {
    this.id = id;
    this.price = price;
  }

  public static Products byId(int id) {
    for (Products product : Products.values()) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  public int getPrice() {
    return price;
  }

  public int getId() {
    return id;
  }
}
