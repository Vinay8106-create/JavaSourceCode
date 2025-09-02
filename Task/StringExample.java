package Task;

import java.util.*;

public class StringExample {
  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("j");
    l.add("ji");
    l.add("jiiii");
    l.add("jiii");
    l.add("jii");

    // sort the Colletion Object based on length of the String
    Comparator<String> com = new Comparator<String>() {    // in anonymous class it is compulsery to mention Generic on bothsides 

      // now override the compare() method
      public int compare(String i, String j) {
        // find the String length
        int StringLength1 = i.length();
        int StringLength2 = j.length();
        // i got two adjacent Strings lengths, now compare them and sort in ascending order
        if (StringLength1 > StringLength2) {
          return 1;  // if we return 1, then it will swap
        } else {
          return -1;  // if we return -1, it will not swap
        }
      }
    };

    // before sorting 
    for (String s : l) {
      System.out.print(s);
      System.out.println();
  }

  System.out.println("============================================================");
    Collections.sort(l, com);

    // after sorting
    for (String s : l) {
      System.out.print(s);
      System.out.println();
    }
  }
}
