package Task2;

public class Main {
    static void main(String[] args) {

        LinkedListEx2<Integer> list = new LinkedListEx2<Integer>();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);


//        Node<Integer> head = list.getHead();
//        Node<Integer> second = head.getNext();
//        Node<Integer> last = second.getNext();
//
//        last.setNext(second);
//        System.out.println(list);
//        System.out.println(list.getNodeBefore(4));
//        System.out.println(list.getNodeBefore(2));

        System.out.println(list);
        System.out.println(list.getNodeBefore(5));



    }
}
