package OOP_Programs;

public class MethodOverloading {
  /*  creating multiple methods in the same class with same method signature but differs inf :
   *    -> no of arguments
   *    -> datatype of arguments
   *    -> order of an arguments
   */

   public void m1() {
    System.out.println("m1 method");
   }

   public void m1(int a, String b) {
    System.out.println("int -> String method");
   }

   public void m1(int a, String b, String c) {
    System.out.println("int -> String -> String method");
   }
  public static void main(String[] args) {
    // to call all the non static methods inside the main method we need to craete the Object 
    MethodOverloading mo = new MethodOverloading();
    mo.m1();
    mo.m1(4, "k");
    mo.m1(5, "l", "m");
  }
}
