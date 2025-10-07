package DSA.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {3, 1, 5, 4, 2};
    bubble(arr);
  }
  public static void bubble (int[] arr) {
    boolean swapped;
    // buuble sort will ompare adjacent elements and swap if lhs is greater than rhs
    // iterate through the array
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
       swapped = false;
      // for each step, max item will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
        // swap
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        swapped = true;
        }
      }
      // if you did not swap a particular value of i, it means the array is sorted hence stop the program
      if (!swapped) {
        break;  
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
