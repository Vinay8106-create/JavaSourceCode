package Java_8_features.StreamAPI.StreamAPIMethods.FlatMapMethod;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
  public static void main(String[] args) {
    List<String> teamA = Arrays.asList("Scott","David","John");
    List<String> teamB = Arrays.asList("Mary","Luna","Tom");
    List<String> teamC = Arrays.asList("Ken","Jony","Kitty");

    List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
    playersInWorldCup.add(teamA);
    playersInWorldCup.add(teamB);
    playersInWorldCup.add(teamC);

    // now i want to print the names of every team member

 /*    // without streams, before java 8
    for (List<String> team : playersInWorldCup) {
      for (String name : team) {
        System.out.println(name);
      }
    }   */

    // java 8, using streams
    List<String> names = playersInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
    System.out.println(names);
    playersInWorldCup.stream().flatMap(pList->pList.stream()).forEach(System.out::println);  // without using lamdas (short form of lamdas) using method references

  }
}
