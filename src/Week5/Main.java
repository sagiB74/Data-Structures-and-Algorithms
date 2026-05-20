package Week5;

public class Main {
    static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // הוספת איברים
        list.addFirst(5);
        list.addFirst(7);
        list.addLastNode(12); // זה בסוף
        list.addLastNode(6);
        list.addFirst(33);
        list.addLastNode(13);
        System.out.println("unsorted list: ");
        System.out.println(list);

//        Node<Integer> middle = list.getMiddle(list.getHead());
//        Node<Integer> afterMiddle = middle.getNext();
//        middle.setNext(null);
//        LinkedList<Integer> left = new LinkedList<>();
//        left.setHead(list.getHead());
//        LinkedList<Integer> right = new LinkedList<>();
//        right.setHead(afterMiddle);



        MergeSort<Integer> sorter = new MergeSort<>();

       sorter.mergeSort(list);
        System.out.println("sorted list: ");
        System.out.println(list);




        // הדפסה רגילה
//        System.out.println("the list: ");
//        System.out.println(list);
//
//        System.out.println("reversed list");
//        list.reverseInPlace(list);
//        System.out.println(list);
//
//        // שימוש ב-findNode
//        Node<Integer> node = list.findNode(30);
//        System.out.println("found node withe 30: " + node.getData());
//
//        // בדיקת delete
//        list.delete(20);
//        System.out.println("after delete 20:");
//        System.out.println(list);
//
//        // לולאת for-each — הנה ה־iterator שלך!
//        System.out.println("for each :");
//        for (Node<Integer> n : list) {
//            System.out.println("value in node: " + n.getData());
//        }
//
//        // בדיקה שאין לולאה
//        System.out.println("there is cycle ? " + list.hasCycle());
//    }
    }
}



