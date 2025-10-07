package ProtechSoft;

import java.util.*;
public class Arraylist {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(1);
    l.add(1);
    l.add(1);

    for (int i = 0; i < l.size(); i++) {
      System.out.println(l.get(i));
    }
  }
}
 