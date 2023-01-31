package multithreading;

public class YieldDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for(int i=1;i<=50;i++){
                    System.out.println("In T1 method");
                }
            }
        });
         Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=50;i++){
                    System.out.println("In T2 method");
                }
            }
        });

         t1.start();
         t2.start();
    }
}
