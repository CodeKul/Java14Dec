package encapsulation;

public class EncapsulationDemo {

    private int id;

    private String name;

    private String address;

    public void setId(int id) {
        if (id>0){
            id = id;
        }else {
            System.out.println("id is zero cannot set");
        }
    }

    public void setName(String str) {
        name = str;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
//        obj.id = 1;
//        obj.name = "Akash";
//        obj.address = "Pune";

//        System.out.println(obj.id + " " + obj.name + " " + obj.address);

        obj.setId(1);
        obj.setName("Akash");
        System.out.println(obj.getId()+" "+ obj.getName());
    }


}
