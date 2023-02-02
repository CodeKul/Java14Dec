package multithreading;

public class SynchronizedDemo {

    static int num = 0;

    public static void main(String[] args) throws InterruptedException {

        SynchronizedDemo obj = new SynchronizedDemo();
        SynchronizedDemo obj1 = new SynchronizedDemo();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 2000; i++) {
                obj.counter();
            }
        });
        t1.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 2000; i++) {
                    obj1.counter();
                }
            }
        });

        t3.start();

        t1.join();
        t3.join();
        System.out.println(num);
    }

    private void counter() {
        synchronized (this) {
            num++;
        }
    }


}
