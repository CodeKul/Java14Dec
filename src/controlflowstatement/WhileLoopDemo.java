package controlflowstatement;

public class WhileLoopDemo {
    public static void main(String[] args) throws InterruptedException {

//        for(int i=1;i<=10;i++){
//            System.out.print(" "+i);
//        }
//
//        int i = 0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=10);

        int counter = 1;
        while (true){
            Thread.sleep(500);
            System.out.println(counter++);
        }

//        int counter = 1;
//        while (i <= 4) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(" " + counter++);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }
}
