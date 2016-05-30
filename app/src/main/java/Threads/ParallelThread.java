package Threads;

/**
 * Created by abhishek on 31/5/16.
 */
public class ParallelThread {
  public static void main(String args[]) {
    myRunnableValue job = new myRunnableValue();
    PrintA a = new PrintA();
    PrintB b = new PrintB();
    PrintC c = new PrintC();
    Thread worker1 = new Thread(a);
    Thread worker2 = new Thread(b);
    Thread worker3 = new Thread(c);

    worker1.setName("worker 1");
    worker2.setName("worker 2");
    worker3.setName("worker 3");

    worker1.start();
    worker2.start();
    worker3.start();
  }
}

class myRunnableValue implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Run by " + Thread.currentThread().getName() + ", Value of x = " + i);
    }
  }
}

class PrintA implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print("A");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class PrintB implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print("B");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class PrintC implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print("C");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
