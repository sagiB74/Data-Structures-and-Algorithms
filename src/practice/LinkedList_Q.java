package practice;

public class LinkedList_Q<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public LinkedList_Q(){
        head = null;
        tail = null;
        int size = 0;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void add(T data){
        if (isEmpty()){
            Node<T> node = new Node<>(data ,null);
            head = node;
            tail = node;
        }else {
            Node<T> node = new Node<>();
            node.setData(data);
            tail.setNext(node);
            tail = node;
        }

        size++;
    }


    public T remove(){
        if (isEmpty()){
            return null;
        }else {
            T val = head.getData();

            head = head.getNext();
            size--;
            return val;

        }

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
