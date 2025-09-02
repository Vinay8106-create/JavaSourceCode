package Array_Programs;

public class PrintEvenOddIndexElements {
    public static void main(String[] args) {
        int[] arr = {444, 67, 0, -44, 2, 99, 89};
        printEvenAndOddIndex(arr);
    }
    public static void printEvenAndOddIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.err.println("Even index elements are : "+arr[i]);
            }
        }
        System.out.println("=================================================");

        for (int j = 0; j < arr.length; j++) {
            if (j % 2 != 0) {
                System.out.println("Odd index elements are :"+arr[j]);
            }
        }
    }
}
