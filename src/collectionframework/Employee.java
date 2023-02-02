package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Employee {

    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1,"Rahul","Pune");
        Employee obj2 = new Employee(2,"Raj","Pune");
        Employee obj3 = new Employee(3,"Ram","Pune");

        List<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s ->{
            System.out.println("id-"+s.getId()+" name-"+s.getName()+" address-"+s.getAddress());
        });
    }
}
