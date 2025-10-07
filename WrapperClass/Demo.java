package WrapperClass;

public class Demo {
  public static void main(String[] args) {
    // wrapper classes are predefined classes present in java.lang package
    // all the wrapper classes are final classes, we cannot inherit
    int a = 9;

    Integer b = Integer.valueOf(a);  // manually converting (pre jdk 1.5 version) , valueOf() is a static method
    System.out.println(b.toString());

    Integer b1 = a;  // Auto-Boxing (from jdk 1.5 version)
    System.out.println(b1.toString());


    Integer c = 23;
    int c1 = c;  // Auto-UnBoxing
    // System.out.println(c1.toString()); // CTE 
    System.out.println(c1);

    // parsing
    String s = "45";
    int i1 = Integer.parseInt(s);
    System.out.println(i1);

    double f = Double.parseDouble(s);
    System.out.println(f);

  }
}
