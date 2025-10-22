package Array_Programs;

public class SecMax {
  public static void main(String[] args) {
    int[] arr = {-55, 0, 4, -879, 234};
    System.out.println(findSecMax(arr));
  }
  public static int findSecMax(int[] arr) {
    if (arr.length == 0) {
      System.out.println("there are no elements in array");
    } else if (arr.length == 1) {
      System.out.println("there are not enough elements");
    }

    int maxElement = arr[0];
    int secondMax = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxElement) {
        secondMax = maxElement;
        maxElement = arr[i];
      } else if (arr[i] < maxElement && arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }

    return secondMax;
  }
}
