package Week7;

public class MyStack {
    private int[] data;
    private int capacity;
    private int size;

    public MyStack(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;

    }

    public int getSize(){
        return size;
    }

    public boolean push(int value){
        if (size < capacity){
            data[size] = value;
            size++;
            return true;
        }
        return false;
    }

    public int pop(){
        if (size == 0){
            throw new RuntimeException();
        }
        return data[--size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if (size == 0){
            throw new RuntimeException();
        }
        return data[size -1];
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


