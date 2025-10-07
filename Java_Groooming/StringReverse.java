package Java_Groooming;

public class StringReverse {
  public static void main(String[] args) {
    String str = "vinay kumar";
    rev(str);
  }
  public static void rev (String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    System.out.println(sb);
  }
}
