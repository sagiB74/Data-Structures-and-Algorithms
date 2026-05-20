package BoolP;

public class Queue <T>{
    private LL<T> queue = new LL<>();

    public Node<T> Top(){
        return queue.getHead();
    }

    public void enqueue(T value){
        queue.addLast(value);
    }

    public T dequeue(){
        return queue.removeFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.getSize();
    }

    public boolean isContain(Queue<T> queue , T num){
        Queue<T> temp = new Queue<>();
        boolean found = false;
        while (!queue.isEmpty()){
            T current = queue.dequeue();
            if (current == num){
                found = true;
            }
            temp.enqueue(current);
        }
        while (!temp.isEmpty()){
            queue.enqueue(temp.dequeue());
        }

        return found;
    }

    public void mergeQueue(Queue<T> queue1 , Queue<T> queue2){
        while (!queue2.isEmpty()){
            queue1.enqueue(queue2.dequeue());
        }

    }

    public Queue<T> SmartMerge(Queue<T> q1 , Queue<T> q2){
        Queue<T> res = new Queue<>();
        while (!q1.isEmpty() && !q2.isEmpty()){
            res.enqueue(q1.dequeue());
            res.enqueue(q2.dequeue());
        }

        if (q1.isEmpty()){
            while (!q2.isEmpty()){
                res.enqueue(q2.dequeue());
            }
        }else {
            while (!q1.isEmpty()){
                res.enqueue(q1.dequeue());
            }
        }
        return res;


    }


    @Override
    public String toString(){
        return queue.toString();
    }
}
