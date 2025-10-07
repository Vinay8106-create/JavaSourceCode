package Java_8_features.StreamAPI.StreamAPIMethods.CountMethod;

import java.util.*;

public class Demo1 {
  public static void main(String[] args) {
    List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // whenever we have condition (check even) we need to go for filter()
    // i need to count how mant even numbers are there in list

    // count()
    long evenNumbersCount = numbersList.stream().filter(num->num%2==0).count();
    System.out.println(evenNumbersCount);

    // min() : it will take comparator with two values as arguments and returns Optional <Integer> type
    Optional<Integer> min = numbersList.stream().min((val1, val2)->{return val1.compareTo(val2);});

    System.out.println(min.get());   // this get method is present in Optional class

    // max() : it will take comparator with two values as arguments and returns Optional <Integer> type
    Optional<Integer> max = numbersList.stream().max((val1, val2)->{return val1.compareTo(val2);});

    System.out.println(max.get());   // this get method is present in Optional class
  
  }
}
