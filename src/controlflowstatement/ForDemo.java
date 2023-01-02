package controlflowstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForDemo<T> {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            System.out.print(" "+i);
        }

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int i:arr){//enhanced for loop
            System.out.println(i);
        }

        Arrays.asList(1,2,3,45,6).forEach(System.out::println);

        for(int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/**
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *

 */
