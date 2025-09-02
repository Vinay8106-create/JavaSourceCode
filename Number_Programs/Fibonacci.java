package Number_Programs;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibo(29));
    }
    public static int findFibo(int n) {
        // fibonacci series starts from 0
        int a = 0;
        int b = 1;
        
        int fibo = 0;

        for (int i = 2; i <= n; i++){
            fibo = a+b;

            a = b;
            b = fibo;
        }

        return fibo;
    }
}
