package Threads;

public class Fact {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
  }
  public static int fact(int n) {
    // fact is n*(n-1)....... upto 1
    if (n == 0 || n == 1) return 1;

    return n*fact(n-1);
  }
}
