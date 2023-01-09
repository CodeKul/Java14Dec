package exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        int i =10;
        int j=0;

        try
        {
            try {
                int c = i/j;
                System.out.println(c);
            }catch (Exception arithmeticException){
                arithmeticException.printStackTrace();
            }
            String str = null;
            System.out.println(str.toUpperCase());
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }

        System.out.println("Hello");

    }
}
