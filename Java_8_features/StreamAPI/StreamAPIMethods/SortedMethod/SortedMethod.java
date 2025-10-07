package Java_8_features.StreamAPI.StreamAPIMethods.SortedMethod;

import java.util.*;
import java.util.stream.Collectors;

// sorted () : this method will sot the Objects of collection after adding them into stream()
public class SortedMethod {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);

    List<Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());

    System.out.println(sortedList1);  // ascending order

    // need to sort in descending order
    List<Integer> sortedList2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sortedList2);

    // Strings
    List<String> StringList = Arrays.asList("John", "Mary", "Kim","David", "Smith");
    List<String> sortedStringList1 = StringList.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedStringList1);

    // reverse order
    List<String> sortedStringList2 = StringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sortedStringList2);
  }
}
