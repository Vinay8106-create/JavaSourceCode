package Java_8_features;

import java.util.*;

/*
 * Optional<Integer> marks = 
 * Optional is a container which can also have null values and have sny type of wrapper calss
 * Optional is used to avoid NullPointerException (NPE)
 */

public class OptionalClass1 {
  public static void main(String[] args) {
    Map<String, Integer> marks = new HashMap<>();
    marks.put("Rahul", 100);
    marks.put("simmy", 200);
    // iterate through the map
    for (Map.Entry<String, Integer> entry : marks.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
      System.out.println("-----------");
    }

    // System.out.println(marks.get("rohit")>10);  // NPE

    // Optional utility class
    Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("rohit"));
    System.out.println(marksOfRohit.get());  // even after rohit marks are null, Optional will return Optional.empty
    if(marksOfRohit.isPresent()) {
      // write your code here
    } else {
      System.out.println("I am not present");
    }
    
  }

}
