package Week3;

import java.util.Iterator;

public class Main {
    static void main(String[] args) {
        StringExample example = new StringExample("koala");
        Iterator<Character> iter = example.iterator();


//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }


        for (Character ch : example) {
            System.out.println(ch);
        }
    }

    }





