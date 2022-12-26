package abstraction;


import encapsulation.EncapsulationDemo;

/**
 * abstraction - hiding details and showing functionality
 *
 */
public class Football implements Sports,Sports2{
    @Override
    public void play() {
        System.out.println("in football");
    }

    public static void main(String[] args) {
//        Football obj = new Football();
//        obj.play();

//        EncapsulationDemo obj = new EncapsulationDemo();
//        obj.id = 1;
//        obj.name ="Akash";
//        obj.address = "Pune";
//
//        System.out.println(obj.id+" "+ obj.name+" "+obj.address);
    }

}
