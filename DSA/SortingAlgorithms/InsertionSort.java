package DSA.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {-5, 0};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j-1);
        } else {
          break;  // arr is already sorted, so no need to compare again
        }
      }
    }
  }

  public static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
