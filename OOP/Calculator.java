package OOP;

public class Calculator {
  public double addition(int a, int b) {
    return a+b;
  }

  public double subtraction(int a, int b) {
    return a-b;
  }

  public double multiplication(int a, int b) {
    return a*b;
  }

  public double division(int a, int b) {
    return a/b;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.addition(5, 5));
    System.out.println(calculator.subtraction(5, 5));
    System.out.println(calculator.multiplication(5, 5));
    System.out.println(calculator.division(5, 5));
  }
}
