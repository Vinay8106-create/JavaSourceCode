package Programms.NumberPrograms;

public class PrimeInRange {
    public static void main(String[] args) {
        PrimeInrange(50);
    }
    public static void PrimeInrange(int n) {
        for (int i = 1; i <= n; i++) {
            // now i am focusing on 1st number , need to check wheather it is prime or not
            // for a number to be prime it should be divisable by 1 and it's own
            int countFactors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countFactors++;
                }
            }

            if (countFactors == 2) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
