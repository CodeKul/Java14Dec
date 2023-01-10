package exceptionhandling;

public class ThrowAndThrowsKeyword {
    public static void main(String[] args) {
        ThrowAndThrowsKeyword obj = new ThrowAndThrowsKeyword();
        obj.show();
    }

    public void show(){
        System.out.println("In show");
        try {
            throw new Exception("Throwing exception");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
