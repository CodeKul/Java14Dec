package questions;

public class Question1 {
    public static void main(String[] args) {

        String str = "aaabbccdee";
        char[] arr = str.toCharArray();
        int count;
        for (int i=0;i<arr.length;i++){
            count =1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }else {
                    break;
                }
                i=j;
            }
            System.out.print(arr[i]+""+count);
        }
    }
}
