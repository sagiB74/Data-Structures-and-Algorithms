package Week7;

public class MyQueue {
    private int[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyQueue(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value){
        if (size == capacity){
            throw new RuntimeException("queue is full");
        }
        rear = (rear + 1)%capacity;
        data[rear] = value;
        size++;

    }

    public int dequeue(){
        if (size == 0){
            throw new RuntimeException("queue is empty");

        }
        int value = data[front];
        front = (front + 1)%capacity;
        size--;
        return value;
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        if (size == 0){
            throw new RuntimeException("queue is empty");
        }
        return data[front];
    }

    public boolean isEmpty(){
        return size == 0;
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
