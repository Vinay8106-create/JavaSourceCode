package Threads.MasterThreads;

// 2nd way to create Thread is implementing runnable interface
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Runnable thread is running.....");
  }
  public static void main(String[] args) {
    MyRunnable t2 = new MyRunnable();
    // again we have to create Object for Thread class, because start() method is there in Thread class and it is necessary to start the Thread execution
    Thread t = new Thread(t2);
    t.start();  // start() call run() internally
  }
}

/* Thread Life Cycle (states)
1 - new : Thread object created but not started
2 - Runnable : After calling start().Ready to run or running
3 - Blocked/Waiting : waiting for a monitor lock or another thread
4 - Terminated : Finished execution */

/*  
| Method          | Description                                           |
| --------------- | ----------------------------------------------------- |
| `start()`       | Starts thread, calls `run()` internally.              |
| `run()`         | Code executed by the thread.                          |
| `sleep(ms)`     | Temporarily pauses thread for given milliseconds.     |
| `join()`        | Waits for another thread to finish before continuing. |
| `isAlive()`     | Checks if a thread is still running.                  |
| `yield()`       | Gives chance for other threads of equal priority.     |
| `setPriority()` | Sets priority (1–10).                                 |
| `interrupt()`   | Interrupts a sleeping/waiting thread.                 |
*/