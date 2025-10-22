package Practice;

public class MethodOverloading {
  int a;
  String name;

  public MethodOverloading (String name) {
    this.name = name;
    System.out.println("zero argument constructor");
  }

  public MethodOverloading(int a) {
    this.a = a;
  }

  public void m(int a) {
    System.out.println("1st Method");
  }

  public void m() {
    System.out.println("second method");
  }

  public void m(String b) {
    System.out.println("third method");
  }

  public static void main(String[] args) {
    MethodOverloading methodOverloading = new MethodOverloading(2);
    MethodOverloading methodOverloading2 = new MethodOverloading("j");
    System.out.println(methodOverloading);
    System.out.println(methodOverloading2);

    methodOverloading2.m("h");
  }
}
