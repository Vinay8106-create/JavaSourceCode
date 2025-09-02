package Number_Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
    public static boolean isPrime(int n){
        if (n == 1) return true;

        int factCount = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factCount++;
            }
        }
        if (factCount == 1) return true;
        else return false;
    }
}
