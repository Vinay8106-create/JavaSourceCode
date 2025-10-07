package Java_8_features.StreamAPI;

import java.util.*;

public class Part1 {
  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

    // for (int i = 0; i < 6; i++) {
    //   System.out.println(values.get(i));
    // }

    // we can use 2nd way instead of above logic, using Iterator interface
    // Iterator is an interface present in java.util package
    // we can modification in Iterator also

    // Iterator<Integer> i = values.iterator();
    // while (i.hasNext()) {  // hasNext() just checks the value and
    //   System.out.println(i.next());  // next() will iterate the value
    // }

    // now, let's implement 3rd way using enhanced for loop
    // if we want to print all the elements irrespective of first and last position, in that case we can use enhanced for loop
    for (int i : values) {
      System.out.println(i);
    }

    // the above loops are called as External iterations

    // INTERNAL ITERATIONS
    // we can achieve internal iterations with the help of Stream API
  }
}
