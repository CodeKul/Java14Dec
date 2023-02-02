package multithreading;

public class MultithreadingDemo extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();

        obj.start();
    }

    @Override
    public void run() {
        System.out.println("Run method");
        System.out.println(Thread.currentThread().getName());
    }
}
