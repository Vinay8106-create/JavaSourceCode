package Programms.Strings;

public class ReferenceCheck {
  public static void main(String[] args) {
    String s1 = "java"; 
    String s2 = s1;
    System.out.println(s1.equals(s2));  // both String Objects have same reference and values too
  }
}
