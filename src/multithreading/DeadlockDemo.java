package multithreading;

public class DeadlockDemo {
    public static void main(String[] args) {

        String scanner = "Scanner";
        String printer = "Printer";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (scanner){
                    System.out.println(Thread.currentThread().getName()+" Locked "+scanner);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (printer){
                    System.out.println(Thread.currentThread().getName()+" Locked "+printer);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (printer){
                    System.out.println(Thread.currentThread().getName()+" Locked "+printer);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (scanner){
                        System.out.println(Thread.currentThread().getName()+" Locked "+scanner);
                    }
                }
            }
        });

        t1.setName("Desktop");
        t2.setName("Laptop");

        t1.start();
        t2.start();

    }
}
