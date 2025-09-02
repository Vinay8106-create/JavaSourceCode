package Collection;

import java.util.*;

public class LinkedHashMapClass {
  public static void main(String[] args) {
    Map<Integer, String> map = new LinkedHashMap<Integer, String>();
    map.put(1, "j");
    map.put(null, "j");
    // map.put(1, "p");
    map.put(2, "j");
    map.put(3, "l");
    map.put(4, "j");
    System.out.println(map);
    System.out.println(map.get(3));
    // Similar to HahMap
    // 1) LinkedHashMap will never support duplicates keys
    // 2) LinkedHashMap will allow only one null key
    // 3) LinkedHashMap follows insertion order
    // 4) LinkedHashMap does not have indexing, we can pass key in get() to access it's value
    // default data structure is combination of HashTable and Doubly-Linked-List
  }
}
