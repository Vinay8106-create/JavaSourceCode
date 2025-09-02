package Number_Programs;

public class FiboRecursion {
    public static void main(String[] args) {
        System.out.println(findFibo(6));
    }
    public static int findFibo(int n) {
        if (n <= 1) return n;

        int fibo = findFibo(n-1) + findFibo(n-2);
        return fibo;
    }
}
