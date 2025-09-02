package Number_Programs;

public class FactRecursion {
    public static void main(String[] args) {
        System.out.println(findFact(6));
    }
    public static int findFact(int n){
        if (n == 0 || n == 1) return 1;
        // int fact = 1;
        // while (n >= 2) {
        //     fact = fact * n;
        //     n--;
        // }
        // return fact;

        return n * findFact(n - 1);
        
    }
}
