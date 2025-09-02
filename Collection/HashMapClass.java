package Collection;

import java.util.*;

public class HashMapClass {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "John");
    map.put(2, "wick");
    map.put(null, "something");
    map.put(1, "something1");

    System.out.println(map);
    System.out.println(map.get(null));

    // Map interface have some properties
    // 1) it does not allow duplicate keys
    // 2) HashMap will allow only one null value
    // 3) HashMap does not follow insertion order
    // 4) HashMap does not have any index, we can pass key in get method to acces it's value
    // 5) default data dtructure for HashMap is array buckets, and based on key function (key % 16) the entry will get stored
  }
}
