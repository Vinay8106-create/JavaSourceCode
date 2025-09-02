package Array_Programs;

public class PrintSecHalfElements {
    public static void main(String[] args) {
        int[] arr = {444, 67, 0, -44, 2, 99, 89};
        print(arr);
    }
    public static void print(int[] arr) {
        int l = arr.length / 2;
        for (int i = l; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
