package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInWord {
    public static void main(String[] args) {

        String str = "Welcome in in Pune".toLowerCase();
        String[] splited = str.split("\\s");

        Map<String,Integer> map = new HashMap<>();
        for (String ch :splited){

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
               map.put(ch,1);
            }
        }

        System.out.println(map.entrySet());
    }
}
