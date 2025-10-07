package Java_8_features.StreamAPI.StreamAPIMethods.CountMethod;

import java.util.Arrays;
import java.util.List;

public class CountMethod {
  public static void main(String[] args) {
    List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

    long count = vehicleList.stream().distinct().count();   // count() will return long type of variable
    System.out.println(count);
  }
}
