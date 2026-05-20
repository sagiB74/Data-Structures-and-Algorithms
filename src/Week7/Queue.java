package Week7;

public class Queue {
    private int[] data;
    private int front; //pointer
    private int rear; // pointer
    private int size; // = 0 empty , = capcity full
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int value) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
    }
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int value = data[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return data[front];

    }
}
