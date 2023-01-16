package exceptionhandling;

public class ThrowAndThrowsKeyword {
    public static void main(String[] args) throws Exception {
        ThrowAndThrowsKeyword obj = new ThrowAndThrowsKeyword();
        obj.show();
    }

    public void show() throws Exception,ArithmeticException{ //declaring exception
        System.out.println("In show");
        try { //handling exception
            throw new Exception("Throwing exception");
        }catch (Exception e){

        }
        throw new Exception("Throwing exception");
    }
}

/**
 *    Throw                                         Throws
 *
 * 1. to throw exception explicitly            1. to declare exception
 *
 * 2. you can throw only one exception at time 2. you can declare multiple exception at once
 *
 * 3. throw is used in method body             3. throws is used with method signature
 *
 * 4. throw is used with object of class       4. Throws is used with instance of class

 */