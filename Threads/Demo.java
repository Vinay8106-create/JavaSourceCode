package Threads;

// by extending Thread class
public class Demo extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    // we need to create an Object for thread class
    Thread t = new Thread();
    System.out.println(t.currentThread().getName());

    System.out.println(t.currentThread().getPriority());

    try {
       for (int i = 0; i < 5; i++) {
      System.out.println(i);
      t.sleep(1000);  // pause the execution for 5 secs
    }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    Demo d = new Demo();
    d.start();
  }
}
