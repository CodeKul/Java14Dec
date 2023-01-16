package exceptionhandling;

public class ExceptionPropogation {
    public void a(){
        int i=1/0;
    }
    public void b(){
        this.a();
    }
    public void c(){
        this.b();
    }
    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        try {
            obj.c();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
