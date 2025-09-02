package Array_Programs;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 0, -99, 77, 23};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("no elements");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                continue;
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
