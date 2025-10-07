package Java_8_features.StreamAPI.StreamAPIMethods.FindAnyMethod;

import java.util.*;

// findAny() : it will return Optional<String> class
// findFirst()
public class FindAnyMethod {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("one", "two", "three", "one");

      // List<String> stringList = Arrays.asList();  // for empty list it will return NoSuchElementException

    // findAny()
    Optional<String> ele = stringList.stream().findAny();  // it will capture any one value from stream / collection
    System.out.println(ele);  // Optional[one]
    System.out.println(ele.get());  // One

    // findFirst() : return first element fro the collection
    List<String> stringList2 = Arrays.asList("one", "two", "three", "one");
    Optional<String> firstElement = stringList2.stream().findFirst();
    System.out.println(firstElement.get());
  }
}
