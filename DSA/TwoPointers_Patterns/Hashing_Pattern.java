package DSA.TwoPointers_Patterns;

import java.util.Arrays;
import java.util.HashMap;

public class Hashing_Pattern {
  public static void main(String[] args) {
    int[] arr = {5, 2, 4};
    int target = 6;
   System.out.println(Arrays.toString(twoSum(arr, target)));
  }
  
  // // brute force - simple nested for loop
  // public static int[] twoSum(int[] arr, int target) {
  //     for (int i = 0; i < arr.length; i++) {
  //     for (int j = i+1; j < arr.length; j++) {
  //       if (arr[i] + arr[j] == target) {
  //         return new int[]{i, j};
  //       }
  //     }
  //   }
  //   return new int[]{-1, -1};
  // }

  // the array is not sorted so i can't use Two Pointer pattern (use hashing instead for unsorted array)
  // i can first sort the array and then use two pointer
  public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
          int complement = target - arr[i];

          if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
          }
          map.put(arr[i], i);
        }

        return new int[]{-1, -1};
  }
}
