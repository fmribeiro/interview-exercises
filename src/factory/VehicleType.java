package factory;

public enum VehicleType {
//  CAR, ELECTRIC_CAR, TRUCK;
//
//  public Vehicle getVehicle() {
//    Vehicle vehicle;
//    if (this.equals(CAR)) {
//      vehicle = new Car();
//    } else if (this.equals(ELECTRIC_CAR)) {
//      vehicle = new ElectricCar();
//    } else {
//      vehicle = new Truck();
//    }
//    return vehicle;
//  }

  CAR {
    public Vehicle getVehicle() {
      return new Car();
    }
  },
  TRUCK {
    public Vehicle getVehicle() {
      return new Truck();
    }
  }, ELECTRIC_CAR {
    public Vehicle getVehicle() {
      return new ElectricCar();
    }
  };

  abstract Vehicle getVehicle();
}
