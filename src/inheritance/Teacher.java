package inheritance;

/**
 * Acquiring all properties from parent class to child class
 * advantage - code re-usability
 *
 */
public class Teacher {

    int id;
    String name;
    String address;

    public void show(){
        int a;//local
        System.out.println("In teachers ");
    }

}

class MathsTeacher extends Teacher{

    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id =1;
        obj.name = "Prakash";
        obj.address = "Pune";
        obj.show();
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" add=>"+obj.address);
    }
}

class PhysicsTeacher extends Teacher{
    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id =1;
        obj.name = "Jayesh";
        obj.address = "Mumbai";
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" add=>"+obj.address);

    }

}

class ChemistryTeacher extends PhysicsTeacher{
    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id =1;
        obj.name = "Jayesh";
        obj.address = "Mumbai";
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" add=>"+obj.address);

    }

}