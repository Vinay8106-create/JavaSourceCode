package Programms.NumberPrograms;

public class ArmstrongInRange {
    public static void main(String[] args) {
        findArmstrong(153);
    }
    public static void findArmstrong (int n) {
        for (int i = 1; i <= n; i++) {
            // i got the first number, now i need to check is it armstrong  // 153 = 3^3+5^3+1^3
            // count the digits in that number
            int countDigits = 0; int sum = 0;
            int temp = i;
            while (temp > 0) {
             
                countDigits++;
                temp = temp/10;
            }
            //System.out.println(countDigits);

            temp = i;   // re assigning the i value 
            // i got the no of digits
            while (temp > 0) {
                int rem = temp % 10;
                int var = rem;
                for (int k= 1; k < countDigits; k++) {
                    var *= rem;
                }
                temp = temp/10;
                sum = sum + var;
            }
            if (i == sum) {
                System.out.println(i);
                
            }
        }
    }
}
