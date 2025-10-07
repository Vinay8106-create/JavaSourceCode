package Java_8_features.StreamAPI.StreamAPIMethods.Distinct;

import java.util.*;
import java.util.stream.Collectors;

public class DistintMethod {
  public static void main(String[] args) {
    List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");
    
    List<String> distinctVehicleList = vehicleList.stream().distinct().collect(Collectors.toList());
    System.out.println(distinctVehicleList);

    vehicleList.stream().distinct().forEach(vehicle->System.out.println(vehicle));
    vehicleList.stream().distinct().forEach(System.out::println);  // using method references short form of lambda expression
    
  }
}
