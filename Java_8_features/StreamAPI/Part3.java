package Java_8_features.StreamAPI;

import java.util.*;
import java.util.function.Consumer;

public class Part3 {
  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3,4 ,5 , 6);

    Consumer<Integer> c = (Integer i) -> System.out.println(i);  // using lambda expression
    values.forEach(c);
    // we have only one method, so we can follow below approach
    Consumer<Integer> c1 = i -> System.out.println(i);  // using lambda expression
    values.forEach(c1);
    // we can also follow below approach
    values.forEach(i -> System.out.println(i));
  }
}
