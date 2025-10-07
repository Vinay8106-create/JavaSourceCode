package DSA.SortingAlgorithms;

import java.util.Arrays;

// select th emax or min item from array and place it in it's required position
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {-87, 0, -7, 3};
    selection(arr);
  }
  public static void selection (int[] arr) {
    // select max item and place it at it's correct index (i.e at the last index position)
    // if (arr.length == 0 || arr.length == 1) return;

    for (int i = 0; i < arr.length; i++) {
      // i need to swap this with it's correct position index(i.e last index)
      int lastIndex = arr.length -i - 1; // but, after every one 'i' iteration on element will get placed at end, and 2nd max should be placed at 2nd last index position

      // now i need to find max item, we can do that with method
      // after finding max, need to swap with it's correct position
      int maxIndex = getMaxIndex(arr, 0, lastIndex);
      swap(arr, maxIndex, lastIndex);
    }
    System.out.println(Arrays.toString(arr));
  }

  public static int getMaxIndex (int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }

  public static void swap (int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
