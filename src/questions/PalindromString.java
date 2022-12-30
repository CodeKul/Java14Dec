package questions;

public class PalindromString {
    public static void main(String[] args) {

        String str = "madam";
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

        String reverse = "";
        for (int i=str.length()-1;i>=0;i--){
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        if(str.equals(reverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }
}
