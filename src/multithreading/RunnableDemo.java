package multithreading;

public class RunnableDemo implements Runnable {
    public static void main(String[] args) {
        RunnableDemo obj = new RunnableDemo();
        Thread obj1 = new Thread(obj);

        obj1.start();
    }

    @Override
    public void run() {
        System.out.println("In run");
    }
}

/**
 1.New - before the invocation Thread.start()
 2.Runnable - after the invocation of thread.start() method
              and thread scheduler is not selected as running thread
 3.Running - thread scheduler selected as running thread
 4.Blocking - thread wait or sleep state
 5.Dead/TERMINATED - thread execution end or stop()

 */

