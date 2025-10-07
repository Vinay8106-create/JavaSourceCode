package Java_8_features.StreamAPI.StreamAPIMethods.StreamConcatenation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenationOfStream {
  public static void main(String[] args) {
    List<String> animalList = Arrays.asList("Dog", "Cat", "Elephant");
    List<String> birdList = Arrays.asList("peacock", "parrot", "Crow");

    // now i want to concatinate streams not collection
    Stream<String> stream1 = animalList.stream();
    Stream<String> stream2 = birdList.stream();

    List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
    for (String item : finalList) {
      System.out.println(item);
    }
    System.out.println(finalList);
  }
}
