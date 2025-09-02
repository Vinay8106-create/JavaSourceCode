package Programms.Strings;

public class Reverse {
  public static void main(String[] args) {
    String name = "something";
    System.out.println(name.length()/2);
  }
  public static String rev(String str) {
    // first i need to check for edge cases
    if (str.length() == 0 || str.length() == 1) {
      return str;
    }

    // or else iterate through the String and reverse each and every character
    int l = str.length()/2;
    for (int i = 0; i < l; i++) {
      char ch = str.charAt(i);
      int temp = str.charAt(i);
      
    }
    return str;
  }
}
