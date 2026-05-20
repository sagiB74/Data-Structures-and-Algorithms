package Week5;

public class MergeSort<T extends Comparable<T>> {
    public void mergeSort(LinkedList<T> list){
        if (list.getHead() == null || list.getHead().getNext() == null){
            return;
        }
        Node<T> middle = getMiddle(list.getHead());
        Node<T> afterMiddle = middle.getNext();
        middle.setNext(null);
        LinkedList<T>  left = new LinkedList<T>();
        left.setHead(list.getHead());
        LinkedList<T>  right = new LinkedList<T>();
        right.setHead(afterMiddle);
        mergeSort(left);
        mergeSort(right);

        list.setHead(sortMergeIter(left, right));

    }

    private Node<T> sortMergeIter(LinkedList<T> list1, LinkedList<T> list2) {
        Node<T> head1 = list1.getHead();
        Node<T> head2 = list2.getHead();
        Node<T> dummy = new Node<T>(null,null);
        Node<T> tail = dummy;

        while (head1 != null && head2 != null){
//            Comparable<T> compA = (Comparable<T>) head1.getData();
            if (head1.getData().compareTo(head2.getData()) <= 0){
                tail.setNext(head1);
                head1 = head1.getNext();

            }else {
                tail.setNext(head2);
                head2 = head2.getNext();
            }
            tail = tail.getNext();
        }
        if (head1 != null){
            tail.setNext(head1);

        }else {
            tail.setNext(head2);
        }
        return dummy.getNext();

    }
    private Node<T> getMiddle(Node<T> head){
        Node<T> slow = head;
        Node<T> fast = head.getNext();
        while (fast != null){

            fast = fast.getNext();
            if (fast != null){
                slow = slow.getNext();
                fast = fast.getNext();
            }
        }
        return slow;
    }


    public Node<T> mergeSortTwo(Node<T> node1 , Node<T> node2){
        Node<T> result = null;
        if (node1 == null){
            return node2;
        }else if (node2 == null){
            return node1;
        }
        if (node1.getData().compareTo(node2.getData()) <= 0){
            result = node1;
            result.setNext(mergeSortTwo(node1.getNext() , node2));
        }else {
            result = node2;
            result.setNext(mergeSortTwo(node1, node2.getNext()));
        }
        return result;

    }
}
