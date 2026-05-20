package practice;

//stack as linked-list
public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(T val) { //push
        Node<T> node = new Node<>();
        node.setData(val);
        node.setNext(head);
        head = node;
        size++;
    }


    public T removeFirst(){   //pop
        if (isEmpty()){
            return null;
        }
        T value = head.getData();
        head = head.getNext();
        size--;
        return value;
    }


    public T peek(){
        if (isEmpty()){
            return null;
        }

        return head.getData();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("head -> ");

        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            sb.append(" -> ");
            current = current.getNext();
        }

        sb.append("null");
        return sb.toString();
    }

}
