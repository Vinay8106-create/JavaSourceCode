package Number_Programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArm(153));
    }
    public static boolean isArm(int n) {
       // 153 -> 3^3 + 5^3 + 1^3
       // first find number of digits
       int temp = n; int sum = 0;
       int countDigits = 0;
       while (temp > 0) {
        countDigits++;
        temp/=10;
       }

       temp = n;
       while (temp > 0) {
        int rem = temp % 10;
        int power = 1;
        for (int i = 1; i <= countDigits; i++) {
            power = power * rem;
        }
        sum = sum + power;
        temp/=10;
       }

       if (n == sum) {
        return true;
       } else return false;
    }
}
