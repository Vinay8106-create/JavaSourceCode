package Practice;


interface A {
  public static final int a = 9;
  public void m1A();

  public static void m2A(){
    System.out.println("A static method");
  }

  public default void m3A() {
    System.out.println("A default method");
  }
}

interface B {
  void m1B();
}

class C {
  static int b = 8;
  public void m1C() {
    System.out.println("C class method");
  }
}


public class Demo extends C implements A, B{

  @Override
  public void m1A() {
    System.out.println("m1A method from implementation class");
  }

  @Override
  public void m1B() {
    System.out.println("m1B method from implementation class");
  }

  @Override
  public void m3A(){
    System.out.println("A static method");
  }

  public static void main(String[] args) {
    Demo interfaceRef = new Demo();
    interfaceRef.m1C();

    System.out.println(A.a);
    System.out.println(C.b);
    A.m2A();
    interfaceRef.m3A();

  }
}
