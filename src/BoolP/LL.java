package BoolP;

public class LL<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;

    public LL(){
        head = null;
        tail = null;
        size = 0;
    }

    public Node<T> getHead(){
        return head;
    }

    public boolean hasNext(Node<T> node){
        return node.getNext() != null;
    }

    public Node<T> getTail() {
        Node<T> curr = head;
        while (curr.getNext() != null){
            curr = curr.getNext();
        }

        return curr;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(T value){
        Node<T> newNode = new Node<>(value , head);
        head = newNode;
        size++;
        if (tail == null){
            tail = newNode;
        }

    }

    public T removeFirst(){
        if (isEmpty()){
            return null;
        }
        T value = head.getData();
        head = head.getNext();
        size--;
        return value;
    }

    public void addLast(T value){
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        newNode.setNext(null);

        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;

        }
        size++;
    }

    public void reversList(LL<T> lst) {
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> next = null;

        while (curr != null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;


        }
        head = prev;

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
