package Java_8_features.StreamAPI.StreamAPIMethods.Filter;

import java.util.*;
import java.util.stream.Collectors;

// when we have multiple conditions in filter

public class Filter2 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("vinayKu", "johnwick","robert","hexagons");
    // filter the data in collection based on two conditions (length of the name should be greater than 6 and less than 8)
    // filter only those names and print
    List<String> longNames = new ArrayList<>();

    /* longNames = names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
    System.out.println(longNames);  */

    names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
    names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);  // another way by replacing lambda expression
  }  
}

