package Array_Programs;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {4, 0, -99, 77, 23};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        if (arr.length == 0) System.out.println("no elements");

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
