package Threads;

// by imolementing runnable interface
public class MyThread implements Runnable{
  @Override
  public void run() {
    int i = 0;
    while (i < 5) {
      System.out.println("hi");
      i+=2;
    }
  }

  public static void main(String[] args) {
    MyThread m = new MyThread();
    // we need to creating Object of Thread class here 
    Thread t = new Thread(m);
    t.start();
  }
}
