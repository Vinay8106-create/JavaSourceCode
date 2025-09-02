package Array_Programs;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {34, 5, 0, 1, 2, 0, 0, 5, -34};
        int l = removeDup(arr);
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int removeDup(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l;) {
                if (arr[j] == arr[i]) {
                    // i found the duplicate, remove it by shifting the elements 1 step back
                    for (int k = j; k < l - 1; k++) {
                        // now shift the elements
                        arr[k] = arr[k+1];
                    }
                    l--;  // reduce the size by one element
                } else {
                    j++;
                }
            }
        }
        return l;
    }
}
