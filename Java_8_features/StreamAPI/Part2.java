package Java_8_features.StreamAPI;

import java.util.*;
import java.util.function.Consumer;

public class Part2 {
  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4 ,5, 6);
    /*  Internal Iterations
     * -> In order to achieve Internal Iterations we should use Stream API
     */
    
     // this Consumer interface will have only one abstract method, this is accept(Oject o)
    Consumer<Integer> c = new Consumer<Integer>() {
      public void accept(Integer i) {
        System.out.println(i);
      }
    };

      values.forEach(c); // inside parenthesis entire expression is of functional interface
  }
}


// we can create another class to create Object for Consumer interface or else we can also use anonymous class
// class CC implements Consumer {

// }
