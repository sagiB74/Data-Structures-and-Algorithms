package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main(String[] args) {
        Pirate p1 = new Pirate("luffy" , 560);
        Pirate p2 = new Pirate("zorro" , 400);
        Pirate p3 = new Pirate("sanji" , 350);

//        LinkedList<Pirate> list = new LinkedList<>();
//        list.addFirst(p1);
//        list.addFirst(p2);
//        list.addFirst(p3);
//        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);

//        LinkedList_Q<Pirate> list = new LinkedList_Q<>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1.equals(p2));

//        HashSet<Pirate> set = new HashSet<>();
//        Pirate p4 = new Pirate("sanji" , 350);
//        System.out.println("add p1: " + set.add(p1));
//        System.out.println("add p2: " + set.add(p2));
//        System.out.println("add p3: " + set.add(p3));
//        System.out.println("add p3: " + set.add(p3));
//        System.out.println("add p4: " + set.add(p4));
//        System.out.println(p3.hashCode());
//        System.out.println(p4.hashCode());
//
//        System.out.println("set size = " + set.size());
//        System.out.println(set);


        HashMap<Pirate, String> map = new HashMap<>();

        map.put(p3, "Cook");
        map.put(p1 , "caption");
        System.out.println("get p3: " + map.get(p3)); // צריך להחזיר "Cook"
        System.out.println("get p1: " + map.get(p1));
        p1.setBounty(1000);  // the hash changed , map sends to wrong bucket !
        System.out.println("get p1: " + map.get(p1));
    }




}
