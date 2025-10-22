package OOP;

import java.util.*;

public class Laptop implements Comparable<Laptop>{
  String brand, ramSize;
  double price;
  public Laptop(String brand, String ramSize, double price) {
    this.brand = brand;
    this.ramSize = ramSize;
    this.price = price;
  }

  @Override
  public int compareTo(Laptop laptop) {
    return Double.compare(this.price, laptop.price);
  }

  @Override
  public String toString() {
    return "Brand: "+brand+", ramSize is: "+ramSize+", price: "+price;
  }
  
  public static void main(String[] args) {
    List<Laptop> laptops = Arrays.asList(
      new Laptop("Dell", "16GB", 75000),
      new Laptop("HP", "8GB", 70000),
      new Laptop("APPLE", "16GB", 120000)
    );

    Collections.sort(laptops);
    System.out.println("laptops sorted by prices: ");
    for (Laptop l1 : laptops) {
      System.out.println(l1);
    }
  }
  
}
