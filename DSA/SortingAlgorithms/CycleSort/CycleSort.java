package DSA.SortingAlgorithms.CycleSort;

import java.util.Arrays;

// pattern - when given input from range 0 to (n-1) or 1 to n continuous numbers, even if it is unsorted also fine

public class CycleSort {
  public static void main(String[] args) {
    // int[] arr1 = {-5, 90, 4};  // will not work
    int[] arr = {3, 5, 4, 1, 2};  // will work
    cycleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void cycleSort(int[] arr) {
    // we will move the i forward when the i is at the correct index
    int i = 0;
    while(i < arr.length) {
      // check, wheather this is at correct index or not
      int correctIndex = arr[i] - 1;  // index = (value - 1)
      if (arr[i] != arr[correctIndex]) {
        swap (arr, i, correctIndex);
      } else {
        i++;
      }
    }
  }
  public static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
