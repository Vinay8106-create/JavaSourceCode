package Java_8_features.StreamAPI.StreamAPIMethods.Filter;

import java.util.*;

// Objects are stored in List and i need to process them

class product {
  int id;
  String name;
  double price;

  public product (int id, String name, double price) {
      this.id = id;
      this.name = name;
      this.price = price;
  }

  public String toString() {
    return "id is :"+id+", name is :"+name+", price is :"+price;
  }
}

public class FilterUsingObjects {
  public static void main(String[] args) {
    
    List<product> productsList = new ArrayList<product>();
    productsList.add(new product(1, "HP",25000));
    productsList.add(new product(2, "DELL",30000));
    productsList.add(new product(3, "LENOVO",28000));
    productsList.add(new product(4, "SONY",23000));
    productsList.add(new product(5, "Apple",90000));

    // now i need to filter the Objects based on the price of the products
    // if price grater than 25000, then add that products into another Collection by filtering them
    productsList.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price));
  }
}
