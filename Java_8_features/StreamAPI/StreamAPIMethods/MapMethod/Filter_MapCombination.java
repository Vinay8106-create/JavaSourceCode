package Java_8_features.StreamAPI.StreamAPIMethods.MapMethod;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
  int empId;
  String empName;
  int salary;

  public Employee(int empId, String empName, int salary) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
  }
}

public class Filter_MapCombination {
  public static void main(String[] args) {
   /*  List<Employee> employeesList= new ArrayList<>();
    employeesList.add(new Employee(101, "Alex",10000));
    employeesList.add(new Employee(101, "Alex",10000));
    employeesList.add(new Employee(101, "Alex",10000));
    employeesList.add(new Employee(101, "Alex",10000)); */
    
    List<Employee> employeesList= Arrays.asList(
      new Employee(101, "Alex", 10000),
      new Employee(102, "Brain", 20000),
      new Employee(103, "Charles", 30000),
      new Employee(104, "David", 40000),
      new Employee(105, "Edward", 50000)
      );

      // first we need to filter the data and then we need to apply trhe map
      // Collection --> stream --> Filter --> map --> collect
      //  Q - i need to print salaries of employees greater than 20,000
      // combination of Filter and Map
      List<Integer> employeeSalList = employeesList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
    System.out.println(employeeSalList);
  }
}
