package DSA.BinarySearch;


// Floor number : greatest number which is smaller than or equal to target
public class Floor_Number {
    public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 1;
    System.out.println(Floor(arr, target));
  }
  public static int Floor(int[] arr, int target) {
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
            return mid;  // return index value where target present
        }
    }
    // if target didn't found means return end (immediate smaller value to the target)
    return end;
  }
}
