package Programms.NumberPrograms;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(15, 25));
    }

    public static int  gcd(int n1,int n2){
        int n3=0;
        if (n1<n2)
            n3=n1;
        else
            n3=n2;

        for (int i = n3; i >0; i--) {
            if (n1%i==0 && n2%i==0) {
                return i;
            }
        }
        return 0;
    }

}
