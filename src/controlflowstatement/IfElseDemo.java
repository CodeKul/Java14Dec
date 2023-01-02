package controlflowstatement;

public class IfElseDemo {

    public static void main(String[] args) {

        int age = 19;
        String nationality = "Indian";

        if(age>=18){
            if(nationality=="Pak"){//nested if
                System.out.println("You can vote");
            }else {
                System.out.println("Not Indian");
            }
        }else{
            System.out.println("You can not vote");
        }

        int a=10,b=220,c=30;
        if(a>b && a>c){//ladder if
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("B is greater");
        }else {
            System.out.println("c is greater");
        }

        int age1 = 19;
        String str = age1>=18?"You can vote":"You cannot vote";
        System.out.println(str);
    }
}
