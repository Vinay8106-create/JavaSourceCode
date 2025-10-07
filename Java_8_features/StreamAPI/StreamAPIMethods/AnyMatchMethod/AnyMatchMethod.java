package Java_8_features.StreamAPI.StreamAPIMethods.AnyMatchMethod;

import java.util.*;

// anyMatch() : it can returns any Object / element from the stream
// allMatch() : it returns  boolean value (true/false)
// noneMatch() : if we pass any value/Object and it does not matching with any of the Objects in the stream,then it wil return true else it will return false
public class AnyMatchMethod {
  public static void main(String[] args) {
    
    Set<String> fruits = new HashSet<String>();
    fruits.add("one apple");
    fruits.add("one mango");
    fruits.add("two apples");
    fruits.add("more grapes");
    fruits.add("two guavas");

    // anyMatch() : any one value in the entire collection / stream should match with given value
    boolean result1 = fruits.stream().anyMatch(value-> {return value.startsWith("one");});
    System.out.println(result1); // true

    // allMatch() : every value in the entire collection / stream should start with given value
    boolean result2 = fruits.stream().allMatch(value-> {return value.startsWith("one");});
    System.out.println(result2);  // false

    // noneMatch() : not even a single value in the entire collection / stream should not start with given value
    boolean result3 = fruits.stream().noneMatch(value-> {return value.startsWith("one");});
    System.out.println(result3);  // false
  }
}
