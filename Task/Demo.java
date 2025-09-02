package Task;

import java.util.*;

public class Demo {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(47);
    l.add(10);
    l.add(32);
    l.add(76);
    l.add(32);

      // we can use anonymous class here, which is declared and iniialized in a single expression
  Comparator<Integer> com = new Comparator<Integer>(){   // for anonymous class we need to mention Generic type on both sides
    // now need to override compare () method 
    public int compare(Integer i1, Integer i2) {  // these i1, i2 and pointing to respective adjacent Objects
        // if you return 1 means it will swap or else for -1 it will not
      /// give a condition to swap
      if (i1 % 10 > i2 % 10)  return 1;
      else return -1;
    }
  };

    Collections.sort(l, com);   // we need to pass reference of Comparator

    System.out.println(l);

  //   for (Integer i : l) {
  //     System.out.println(i);
  // }

  // what if want to sort based on last digit of each Integer Object in ascending order
  // use Comparator to do so

  }
}


