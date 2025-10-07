package Java_8_features.StreamAPI.StreamAPIMethods.MapMethod;

import java.util.*;
import java.util.stream.Collectors;

// Map will transform the source data and place them into another collection. it modifies the data from stream without touching the original data of the collection

// map() will not return anything, it accepts a cosumer type function which it consumes

// in Map one-to-one relationship will be there

public class MapDemo1 {
  public static void main(String[] args) {
    List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
    List<String> vehiclesListInUpperCase = new ArrayList<String>();
    // i have to covert all the names into upperCase and store them into some other collection

    // without using streams bfore java 8
   /*  for (String name : vehicles) {
      vehiclesListInUpperCase.add(name.toUpperCase());
    }
    System.out.println(vehiclesListInUpperCase);  */

    // with streams : map() method also called as Mapping
    vehiclesListInUpperCase = vehicles.stream().map(String->String.toUpperCase()).collect(Collectors.toList());
    System.out.println(vehiclesListInUpperCase);
     
  }
}
