package OOP;

public class Employee {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double updatedSalary() {
    double newSal = salary + (salary*10/100);
    return newSal;
  }

  public static void main(String[] args) {
    Employee employee = new Employee(1, "shyam", 800);
    System.out.println(employee.getSalary());
    System.out.println(employee.updatedSalary());
  }
}
