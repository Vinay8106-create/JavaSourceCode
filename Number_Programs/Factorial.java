package Number_Programs;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n) {
        // edge cases
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact = fact*n;
            n--;
        }
        return fact;
    }
}
