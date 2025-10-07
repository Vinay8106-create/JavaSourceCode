package Java_8_features.StreamAPI.StreamAPIMethods.FlatMapMethod;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
  public static void main(String[] args) {
    // map()
    List<Integer> list1 = Arrays.asList(1, 2,3, 4, 5, 6);
    List<Integer> list2 = list1.stream().map(integer->integer+10).collect(Collectors.toList());
    System.out.println(list2);
    // map(n->n+10) : map is taking single input and modifying it into one output and we collected it in another collection

    // flatmap() : used for complex collection
    List<Integer> lst1 = Arrays.asList(1, 2);
    List<Integer> lst2 = Arrays.asList(3, 4);
    List<Integer> lst3 = Arrays.asList(5, 6);
    // now i need to add all the 3 lst collection into one single collection
    List<List<Integer>> finalLst = Arrays.asList(lst1, lst2,lst3);

    List<Integer> finalresult = finalLst.stream().flatMap(x->x.stream().map(integer->integer+10)).collect(Collectors.toList());
    // finalresult will have all 3 Lists and storing them in stream, then flatMap will cut that stream and take 1 List and place it in stream again, like this flatMap will do for all the Lists present in finalresult,then stream of Objects or Lists will be placed i another collection
    System.out.println(finalresult);
  }
}
