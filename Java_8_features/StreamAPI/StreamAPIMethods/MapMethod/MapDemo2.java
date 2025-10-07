package Java_8_features.StreamAPI.StreamAPIMethods.MapMethod;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
  public static void main(String[] args) {
    List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
    // i want find the lengths of each String and print them
    vehicles.stream().map(String->String.length()).forEach(s->System.out.println(s));
    vehicles.stream().map(String->String.length()).forEach(System.out::println);  // without lamda expression
  }
}
