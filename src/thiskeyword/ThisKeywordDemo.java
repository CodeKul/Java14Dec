package thiskeyword;

/**
 *
 * 1. this keyword is used to refer current class instance variable
 *
 */
public class ThisKeywordDemo {

    int id;
    String name;
    String address;

    public ThisKeywordDemo(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(1,"P","Pune");
        System.out.println(obj);
    }
}
