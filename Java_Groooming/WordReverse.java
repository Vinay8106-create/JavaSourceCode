package Java_Groooming;

public class WordReverse {
  public static void main(String[] args) {
    String str = "Vinay Kumar2";
    rev(str);
  }
  public static void rev(String str) {
    String str1 = str.toLowerCase();
    StringBuilder sb = new StringBuilder();
    // remove spaces and non char and reverse the word without changing their positions
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) < 96 || str1.charAt(i) > 122) {
        continue;
      }
      else if (str1.charAt(i) == ' ') {
        continue;
      }
      else {
        sb.append(str1.charAt(i));
      }
    }
    System.out.println(sb);
  }
}
