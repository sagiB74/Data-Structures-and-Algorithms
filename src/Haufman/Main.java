package Haufman;
import java.util.Map;
import java.util.HashMap;


public class Main {
    static void main(String[] args) {
        Map<Character , Integer> freq = new HashMap<>();
        String str = "ABACCDA";
        for (int i = 0; i < str.length(); i++){
           char c = str.charAt(i);
           if (freq.containsKey(c)){
               freq.put(c , freq.get(c) + 1);
           }else {
               freq.put(c , 1);
           }
        }
        HaufmanAlgo res = new HaufmanAlgo(freq);
        Map<Character , String> resCodes = res.GenerateCode();
        System.out.println("--- Huffman Codes ---");
        for (Map.Entry<Character, String> entry : resCodes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
