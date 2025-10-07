package ProtechSoft;

import java.util.*;

public class MapImplementation {
  public static void main(String[] args) {
    Map<String, Integer> marks = new HashMap<>();
    // Data is stored in key-value pair
    marks.put("rahul", 100);
    marks.put("simmy", 200);
    
    for (Map.Entry<String, Integer> entry : marks.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
      System.out.println("-----------------------------");
    }
  }
}
