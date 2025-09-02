package Programms.NumberPrograms;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {44, 786, 23, 121, 909};
        checkPalindrome(arr);
    }
    public static void checkPalindrome(int[] arr) {
        // i need to print all the plaindrome numbers from the array
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            // now reverse the i   // 555
            int rev = 0;
            while (temp > 0) {
                int rem = temp % 10;
                rev = rev * 10+ rem;
                
                temp = temp / 10;
            }
            // after reversing check with original number
            if (arr[i] == rev) {
                System.out.println(arr[i]);
            } 
        }
    }
}
