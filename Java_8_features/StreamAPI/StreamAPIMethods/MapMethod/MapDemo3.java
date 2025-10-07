package Java_8_features.StreamAPI.StreamAPIMethods.MapMethod;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo3 {
  public static void main(String[] args) {
    List<Integer> numbersList = Arrays.asList(2, 3, 4, 5);
    // now i need to read every value from this collection and multiple every value with 3 and store the result into target collection or print them
    List<Integer> resultList = new ArrayList<>();

    resultList = numbersList.stream().map(integer->integer*3).collect(Collectors.toList());
    System.out.println(resultList);

    // now just print them
    numbersList.stream().map(integer->integer*3).forEach(i->System.out.println(i));
    numbersList.stream().map(integer->integer*3).forEach(System.out::println);  // without lambda expression
  }
}
