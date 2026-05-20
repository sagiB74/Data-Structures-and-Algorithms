package TestPractice;

public class TwoSideQueue {
    private int[] data;
    private int size;
    private int capacity;
    private int front;
    private int back;

    public TwoSideQueue(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;
        this.back = 0;
        this.front = 0;

    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(int value){
        if (size == capacity){
            throw new RuntimeException("queue is full");
        }

        if (size == 0){
            front = 0;
            back = 0;
            data[0] = value;
        }else {
            front = (front - 1 + capacity)%capacity;
            data[front] = value;
        }
        size++;

    }


    public void addLast(int value){
        if (size == capacity){
            throw new RuntimeException("queue is full");
        }
        if (size == 0){
            front = 0;
            back = 0;
            data[0] = value;
        }else {
            back = (back + 1)%capacity;
            data[back] = value;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            throw new RuntimeException("queue is empty");
        }
        int retVal = data[front];
        front = (front + 1)%capacity;
        size--;

        return retVal;
    }

    public int removeLast() {
        if (size == 0) {
            throw new RuntimeException("queue is empty");
        }
        int retVal = data[back];
        back = (back -1)%capacity;
        size--;
        return retVal;


    }






    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }



}
