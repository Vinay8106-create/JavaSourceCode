package Number_Programs;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        swap(5, 6);
    }
    public static void swap(int a, int b) {
        a = a+b;  // 11
        b = a-b;  // 11 - 6 -> 5
        a = a - b;
        System.out.println(a);  // 6
        System.out.println(b);  // 5
    }  
}
