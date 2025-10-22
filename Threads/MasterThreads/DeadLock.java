package Threads.MasterThreads;

class A {
  synchronized void methodA(B b) {
    b.last();
  }
  synchronized void last() {
  }
}

class B {
  void methodB(A a) {
    a.last();
  }
  synchronized void last() {}
}

public class DeadLock {
  
}

// Dead lock : occurs when two or more threads are waiting indefinitely for each other's lock
