package inheritance;

public class InheritanceDemo {//parent class,base class,super class

    int id; //member variable
    String name;


}

class Customer extends InheritanceDemo{//child class,derived class,sub class

    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.id = 1;
        obj.name = "Rahul";
        System.out.println("id="+obj.id+" name="+ obj.name);
    }
}

class Employee extends InheritanceDemo{

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.id = 1;
        obj.name = "Rahul";
        System.out.println("id="+obj.id+" name="+ obj.name);
    }
}