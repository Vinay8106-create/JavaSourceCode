package Programms.NumberPrograms;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        System.out.println(isString(n));
    }
    public static boolean isString(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int fact = 1;
            int rem = temp % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact*i;
            }
            sum = sum + fact;
            temp/=10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
