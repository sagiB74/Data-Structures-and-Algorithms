// Shelley Monis and Sagi Benilush.


package Task2;

import java.util.Iterator;

public class LinkedListEx2<T> implements Iterable<Node<T>> {

    private Node<T> head;

    public LinkedListEx2() {
        head=null;
    }
    public void addFirst(T data) {
        Node<T> newNode=new Node<T>(null,data);
        if (head!=null){
            newNode.setNext(head);
        }
        head=newNode;
    }

    //Question 1
    public Node<T> getNodeBefore(T val){
       if (head == null || head.getData().equals(val)){
           return null;
       }
       Node<T> current = head;

       while (current.getNext() != null){
           if (current.getNext().getData().equals(val)){
               return current;
           }
           current = current.getNext();
       }
       return null;
    }

    //Question 2
    public boolean hasCycle(){
       Node<T> slow = head;
       Node<T> fast = head;
       while (fast != null && fast.getNext() != null){
           slow = slow.getNext();
           fast = fast.getNext().getNext();
           if (slow == fast){
               return true;
           }
       }
       return false;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Node<T> data : this) {
            buffer.append(data.getData());
            buffer.append(" ");
        }
        return buffer.toString();
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new LinkedListEx2Iter<>();
    }

    public Node<T> getHead() {
        return head;
    }

    private class LinkedListEx2Iter<E> implements Iterator<E>{
        private Node<T> inNode;

        public LinkedListEx2Iter() {
            inNode =  head;
        }
        @Override
        public boolean hasNext() {

            return (inNode!=null);  //can also check if next !=null
        }
        @Override
        public E next() {
            E back= (E) inNode;
            inNode = inNode.getNext();
            return back;
        }

    }





}