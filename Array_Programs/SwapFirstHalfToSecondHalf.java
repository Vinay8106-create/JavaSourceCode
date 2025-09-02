package Array_Programs;

import java.util.Arrays;

public class SwapFirstHalfToSecondHalf {
    public static void main(String[] args) {
        int[] arr = {55, 0, 89, 2, 1, 6, 123};
        swap(arr);
        swap2(arr);
    }
    public static void swap(int[] arr) {
        // i need to iterate through the array upto mid element
        int l = arr.length/2;  // 2
        for (int i = 0; i < l; i++) {
             int temp = arr[i];
             arr[i] = arr[l - i];
             arr[l - i] = temp;
        }

        System.out.println(Arrays.toString(arr));   // [2, 0, -89, 55, 1, 6, 123]
    }

    public static void swap2(int[] arr) {
        // i need to iterate through the array upto mid element
        int l = arr.length/2;  // 2
        for (int i = 0; i < l; i++) {
             int temp = arr[i];
             arr[i] = arr[arr.length - 1 - i];
             arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));    // [123, 6, 1, 55, -89, 0, 2]
    }
}
