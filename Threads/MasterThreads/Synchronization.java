package Threads.MasterThreads;

// when multiple Threads access shared resources, data inconsistency may occur (race condition)
// only one thread can execute a synchronized block/method on a given object at a time
// synchronized keyword prevents race condition
public class Synchronization {
  int count = 0;
  synchronized void increment() {
    count++;

  // static Synchronization : locks on the class not instance
  // static synchronized void printTable(int n) {  }
  }
}

