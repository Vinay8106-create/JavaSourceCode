package Threads.MasterThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameWork {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 5; i++) 
    executor.execute(() -> System.out.println(Thread.currentThread().getName()));
    executor.shutdown();
  }

  public static void m1() {
    return;
  }
}


// Thread pools (Executor FrameWork) : efficient way to manage multiple threads
/*  ReentrantLock : Explixit lock with more control than synchronized.
Lock lock = new ReentrantLock();
lock.lock();
try {
  // critical section
} finally {
  lock.unlock();
}   */

