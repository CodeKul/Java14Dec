package multithreading;

public class SynchronizedDemo {

    int num = 0;

    public static void main(String[] args) throws InterruptedException {

        SynchronizedDemo obj = new SynchronizedDemo();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 2000; i++) {
                obj.counter();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 2000; i++) {
                    obj.counter();
                }
            }
        });

        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.num);
    }

    private void counter() {
        synchronized (this) {
            num++;
        }
    }
}
