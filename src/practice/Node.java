package practice;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data , Node<T> next){
        this.data = data;
        this.next = next;

    }

    public Node(){}

    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }

    public void setData(T date){
        this.data = date;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node:  next =" + ( (next!=null) ? next.getData(): "null"  ) + ", data=" + data;
    }
}

