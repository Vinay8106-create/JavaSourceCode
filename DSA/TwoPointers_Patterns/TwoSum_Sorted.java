package DSA.TwoPointers_Patterns;

import java.util.Arrays;

// Two Pointers approach is used only incase of sorted arrays to reduce the nested for loop into single for loop
public class TwoSum_Sorted {
  public static void main(String[] args) {
    int[] arr = { 2, 7, 11, 15 };
    int target = 9;
    System.out.println(Arrays.toString(twoSum(arr, target)));
  }

  public static int[] twoSum(int[] arr, int target) {
    // i need to take two pointers (two indices)
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {
        return new int[]{ left + 1, right + 1 };
      } else if (sum < target) {
        left++; // to get bigger number in sum
      } else
        right--;
    }
    return new int[]{ -1, -1 };
  }
}
