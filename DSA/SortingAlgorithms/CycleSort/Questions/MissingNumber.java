package DSA.SortingAlgorithms.CycleSort.Questions;

// Amazon Question [LeetCode - 268]

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = {4,0,2,1};
    System.out.println(findMissingNumber(arr));
  }
  public static int findMissingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      // check value at i is at correct index or not
      int correctIndex = arr[i]; // we are starting from 0
      if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
        swap(arr, i, correctIndex);
      } else {
        i++;
      }
    }

    // search for first missing element
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;  // missing number
      }
    }

    // case-2
    return arr.length;
  }
  public static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
