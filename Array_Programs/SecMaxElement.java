package Array_Programs;

public class SecMaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 23, 0, -99, 77, 23};
        System.out.println(findSecMax(arr));
    }
    public static int findSecMax(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            System.out.println("not enough elements");
        }
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
