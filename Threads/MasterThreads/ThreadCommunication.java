package Threads.MasterThreads;

public class ThreadCommunication implements Runnable{
  synchronized void produce() throws InterruptedException {
    System.out.println("producing......");
    wait();  // releases lock
    System.out.println("Resumed after notification");
  }

  // method to notify waiting thread (produce())
  synchronized void consume() throws InterruptedException {
    Thread.sleep(1000);
    System.out.println("Consumer notifying....");
    notify();
  }

  @Override
  public void run() {
    // try {
    //   produce();  // threads goes into waiting state here only, because there is not other thread to notify it
    //   consume();
    // } catch (InterruptedException e) {
    //   e.printStackTrace();
    // }



    try {
      // Run produce in one thread
      Thread producer = new Thread(() -> {
        try {
          produce();
        }catch(InterruptedException e) {
          e.printStackTrace();
        }
      });

      // Run consume() in another thread
      Thread consumer = new Thread(() ->{
        try {
          consume();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });

      producer.start();
      consumer.start();

      // wait for both to finish
      producer.join();
      consumer.join();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ThreadCommunication t = new ThreadCommunication();
    Thread t1 = new Thread(t);
    t1.start();
  }
}

/*  Inter-Thread Communication : used for coordination between threads (e.g.,producer-consumer)
 Methods (must be called inside synchronized block / method);
- wait() : thread waits and releases lock
notify() : wakes up one waiting thread
notifyAll() : wakes up all waiting threads  */