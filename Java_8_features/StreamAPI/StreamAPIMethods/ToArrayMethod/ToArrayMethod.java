package Java_8_features.StreamAPI.StreamAPIMethods.ToArrayMethod;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

    Object[] arr = stringList.stream().toArray();
    System.out.println(Arrays.toString(arr));
    System.out.println(arr.length);

    for (Object object : arr) {
      System.out.println(object);
    }
  }
}
