package exceptionhandling;

import java.sql.SQLException;

public class MethodOverridingWithExce {


    public void show() throws RuntimeException{
        System.out.println("in show");
    }
}

class Sample extends MethodOverridingWithExce{

    public void show() throws RuntimeException {
        System.out.println("In sample show");
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.show();
    }

}

//if parent class declare no exception then you can declare unchecked exception in child
//if parent class declare exception then you can declare same exception in child
//if parent class declare exception then you can not declare parent exception