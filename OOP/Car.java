package OOP;

public class Car {
  String brand, model;
  double price;

  public Car(String brand, String model, double price){
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  public void displayDetails() {
    System.out.println(brand+", "+model+", "+price);
  }

  public static void main(String[] args) {
    Car car1 = new Car("BMW", "c-class", 9800000);
    car1.displayDetails();

    Car car2 = new Car("lambhorghini", "aventador", 1000000);
    car2.displayDetails();
  }
}
