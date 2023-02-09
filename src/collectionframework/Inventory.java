package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    int id;
    String productName;
    Integer quantity;
    Double price;

    public Inventory(int id, String productName, Integer quantity, Double price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public static void main(String[] args) {
        Inventory obj1 = new Inventory(1,"Fan",10,900.00);
        Inventory obj2 = new Inventory(2,"Tv",20,14000.00);
        Inventory obj3 = new Inventory(3,"Adapter",10,250.00);

        List<Inventory> list = Arrays.asList(obj1,obj2,obj3);

        int qty;
        String prName;
        char choice = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter product name and qty");
            prName = scanner.next();
            qty = scanner.nextInt();
            System.out.println("Do want to continue");
            choice = scanner.next().charAt(0);
            String finalPrName = prName;
            Integer q = qty;
            list.forEach(s->{
                if(finalPrName.equals(s.productName)){
                    s.quantity = s.quantity - q;
                }
            });

        }while (choice=='Y' || choice=='y');

        list.forEach(s->{
            System.out.println(s.productName+" "+s.quantity);
        });
    }
}
