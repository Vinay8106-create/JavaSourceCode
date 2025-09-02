package Task;

import java.util.*;

public class Employee implements Comparable<Employee> {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "id is :" +id+ ", name is :"+ name+ ", salary is :"+salary;
  }

  // need to override compareTo()
  @Override
  public int compareTo(Employee e) {
    return Double.compare(e.salary, this.salary);
    // in each and every wrapper class compareTo() is overrided, so we can just use them in order to sort the Collection Objects based on required variables
  }

  public static void main(String[] args) {
    Employee employee = new Employee(1, "john", 500.0);
    List<Employee> l = new ArrayList<>();
    l.add(employee);
    l.add(new Employee(2, "wick", 600.78));
    l.add(new Employee(3, "james", 333.786));
    l.add(new Employee(4, "something", 20776));
    l.add(new Employee(5, "ram", 123.90));

    for (Employee e : l) {
      System.out.print(e);
      System.out.println();
    }

    // now i need to sort them in ascending order based on salary
    Collections.sort(l);

    System.out.println("=========================================================");

    // after sorting 
    for (Employee e : l) {
      System.out.print(e);
      System.out.println();
    }

    // Comparable interface and Comparator interface both are functional interfaces (i.e, only one abstract methods are there)

  }

}
