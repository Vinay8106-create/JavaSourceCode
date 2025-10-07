package Java_8_features.StreamAPI.StreamAPIMethods.Filter;

import java.util.*;
import java.util.stream.Collectors;

// in our collection we have null values also, we have to remove null and place the non-null Objects into some other collection

public class Filter3 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("cup",null,"forest","sky","book", null,"theatre");
    List<String> result = new ArrayList<>(); 
    // remove the nulls by filtering and add rest of the data into another collection
    result = words.stream().filter(str->str!=null).collect(Collectors.toList());
    System.out.println(result);
  }
}
