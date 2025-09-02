package Collection;

import java.util.*;

public class ArrayListClass {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("j");
    list.add("j");
    list.add("null");
    list.add("null");
    list.add("h");
    list.add("n");
    System.out.println(list);
    System.out.println(list.get(3));
    // list will alllow duplicates
    // List will allow multiple null values
    // List preserves insertion order 
    // List has indexing
    // default data structure for ArrayList is Resizable array
    // initial capacity of resizable array is 16 and increment happens based on formula : IC * (3/2+1)
    // ArrayList have two types of constructors
  }
}
