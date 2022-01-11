package builder;

public class App {

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle.Builder()
      .price(10000.00)
      .type("car")
      .make("Honda")
      .horsePower(150)
      .model("Accord")
      .color("red")
      .doors(4)
      .build();

    System.out.println(vehicle);
  }
}
