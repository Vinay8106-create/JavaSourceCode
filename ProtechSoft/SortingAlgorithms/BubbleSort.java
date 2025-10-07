package ProtechSoft.SortingAlgorithms;

public class BubbleSort {
  public static void main(String[] args) {
    // comparing adjacent elements and swap if they are not in required order
    int[] arr = {-55, 0, 1, 98, 0, -555};
    // sort the input in descending order
  }
  public static void Bubble (int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }
}

/* -> hibernate - mapping (uni & bi-directional) , query parameter and named parameter types of parameters, hibernate transactions
      Spring boot - Rest API, diff between restController and controller, AutoWiredAnnotation
              - spring injection 
              - post mapping, put mapping, get mapping, delete mapping  : annotations
              - ORM FrameWork
              - DAO and DTO in spring boot
              - diff between spring, spring MVC with JPA, spring boot
*/