package exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        int i =10;
        int j=1;
        try {
            try {
                int c = i / j;
                System.out.println(c);
            } catch (Exception arithmeticException) {
                arithmeticException.printStackTrace();
            }
            String str = null;
            System.out.println(str.toUpperCase());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmeticException=>>" + arithmeticException);
        } catch (Exception nullPointerException) {
            System.out.println("nullPointerException=>>" + nullPointerException);
        } finally {
            System.out.println("In finally");
        }

        System.out.println("Hello");

    }
}
