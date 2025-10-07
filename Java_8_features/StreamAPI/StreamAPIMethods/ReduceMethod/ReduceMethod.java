package Java_8_features.StreamAPI.StreamAPIMethods.ReduceMethod;

import java.util.*;

// Reduce() : this method basically will combine the Objects into one single Object
public class ReduceMethod {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

    // reduce() will return Optional <String>
    Optional<String> reduced = stringList.stream().reduce((value,combinedvalue)->{
                              return combinedvalue+value;  // first time returns A+B
                              });

    System.out.println(reduced.get());    // 321CBA
    // usecase : after applying map() on multiple sets we have, we storing them in target stream and once we get all the elements we need to reduce them (collect) into one single collection
    // voting in 3 different places : collect the votes from each individual locations and put together and count total how many votes wwe got
    // map() and reduce() is the big algorithm in BigData
  }
}
