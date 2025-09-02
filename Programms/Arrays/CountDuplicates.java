package Programms.Arrays;

public class CountDuplicates {
  public static void main(String[] args) {
    int[] arr = {4, 6, 12, 12, 22, 2, 0};
    countDuplicates(arr);
  }
  public static void countDuplicates(int[] arr) {
    boolean isDuplicate = false;
    for (int i = 0; i < arr.length; i++) {
      boolean AlreadyCounted = false;
      
      // take one more pointer and check for duplicate
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          // duplicate found
          AlreadyCounted = true;
          break;
        }
      }

      if (AlreadyCounted) continue;

      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          count++;
          isDuplicate = true;
        }
      }
      if (isDuplicate == true && count > 1) {
        System.out.println(arr[i] +", count is :"+count);
      }
    }
  }
}
