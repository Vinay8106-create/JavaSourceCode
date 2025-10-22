package Practice;

public class ExceptionClass {

  // Example for ArithmeticException
  public static void div(int a) throws Throwable {    // Exception propagation
    System.out.println(500/a);
    
    System.out.println("Division ended");
  }

  // Example for NULLPOINTER Exception
    int b;

  public static void main(String[] args) {
    //  System.out.println("main started");
    try {
      div(0);  // ArithmeticException
      System.out.println("done");
    } catch (Throwable e) {
      e.printStackTrace();
    }
      
    //  System.out.println("main ended");

    // ExceptionClass excep = null;
    // System.out.println(excep.b);

    // String s = null;
    // System.out.println(s.equals("hello"));

  }
}
