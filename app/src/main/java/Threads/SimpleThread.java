package Threads;

/**
 * Created by abhishek on 30/5/16.
 */
public class SimpleThread extends Thread {
  public void run(){
    System.out.println("This is the  "+  Thread.currentThread().getName()+ " thread.");
  }

  public static void main(String args[]){
    myRunnable runnable = new myRunnable();
    Thread thread1 = new Thread(runnable);
    SimpleThread thread = new SimpleThread();
    thread.start();
    thread1.setName(" helper");
    thread1.start();
    System.out.println("This is the  "+  Thread.currentThread().getName()+ " thread.");
  }
}

class myRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("This is the  "+  Thread.currentThread().getName()+ " thread.");
  }
}
