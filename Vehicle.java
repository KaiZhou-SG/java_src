


public class Vehicle {
  // it's a superclass  
  public double weight;
  public String name;
  public double speed;

  public Vehicle() {
    weight = 0;
    name = "vehicle";
    speed = 0;
  }

  public Vehicle(double weight, String name, double speed) {
    this.weight = weight;
    this.name = name;
    this.speed = speed;
  }

  public double SpeedUp(double increase) {
    this.speed += increase;
    
    return this.speed;
  }
}
