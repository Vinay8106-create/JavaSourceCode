package Threads.MasterThreads;

// thread is a small part of program which runs independently, it will have it's own memory and cpu time to get executed
// multi-threading : the process of executing multiple threads concurrently.Multi-threading provides concurrent execution (increases application efficiency)

// we can create thread in two ways:
// 1_ by extending Thread class
public class MyThread extends Thread {
  // we have to override the run()
  @Override
  public void run() {
    System.out.println("Thread is running.....");
  }

  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();     // always Thread will start only when we call it with Thread.start()
    System.out.println(currentThread());
  }
}
