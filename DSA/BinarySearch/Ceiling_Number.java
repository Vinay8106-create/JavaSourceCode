package DSA.BinarySearch;


// ceiling number : smallest number which is greater than or equal to target
public class Ceiling_Number {
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 98;
    System.out.println(Ceiling(arr, target));
  }
  public static int Ceiling(int[] arr, int target) {
    // but what if the target is greater than the largest element in the array
    if (target > arr[arr.length - 1]) {
        return -1;
    }
    // first take 2 pointeer to reduce the search space continuosly
    int start = 0;
    int end = arr.length - 1;

    // now i need to reduce the search space based condition 
    while (start <= end) {  // curser will come out of the array
        // find the mid element to start searching in range
        int mid = (start + end)/2;

        if (target > arr[mid]) {
            // target lies on right side of array from mid
            start = mid + 1;
        } else if (target < arr[mid]) {
            // target lies on left side of array from mid
            end = mid - 1;
        } else if (target == arr[mid]) {
            return arr[mid];  // return index value where target present
        }
    }
    // if target didn't found means return start (immediate greater value to the target)
    return arr[start];
  }
}
