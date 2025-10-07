package OOP_Programs;

interface MethodOverriding1 {
  // by-default every variable in an interface is of public static final type
  int a = 2;
  String name = "wick";

  // by-default all the method are of public abstract type
  // from the jdk version 1.8 interface allowed the static (complete method) and non-static (default method)
  public void m2();
  abstract void m3();
}

// we have to give implementation by using sub Class
public class MethodOverriding implements MethodOverriding1{
  // there is a rule in java, that whenever we implement any interface from the sub class we have Override all the abstract methods from the interface
  // while Overriding we can change the return type and increase the visibiity of the method, but cannot decrease
  @Override
  public void m2() {
    System.out.println("m2 method");
  }

  public void m3() {
    System.out.println("m3 method");
  }
  public static void main(String[] args) {
    
  }
}