package Number_Programs;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(isStrong(148));
    }
    public static boolean isStrong(int n) {
        // 145 -> 5!+4!+1! = 145

        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + findFact(rem);
            n/=10;
        }
        // check for equality
        if (temp == sum) return true;
        else return false;
        
    }

    public static int findFact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
