package Array_Programs;

public class FindMax {
  public static void main(String[] args) {
    int[] arr = {-55, 0, 4, -879, 234};
    System.out.println(returnMax(arr));
  }
  public static int returnMax(int[] arr) {
    if (arr.length == 0) {
      System.out.println("there are no elements in the array");;
    }

    int maxElement = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxElement) {
        maxElement = arr[i];
      }
    }
    return maxElement;
  }
}
