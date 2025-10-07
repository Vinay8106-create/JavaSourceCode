package Java_8_features.StreamAPI.StreamAPIMethods.LimitMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
  public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

        // i want to collect some limited Objects
        List<String> limitedVehiclesList = vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedVehiclesList);

        vehicleList.stream().limit(3).forEach(vehicle->System.out.println(vehicle));

  }
}
