package TestPractice;

public class Stack {
    private int[] data;
    private int capacity;
    private int size;

    public Stack(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public int Peek(){
        return data[size -1];
    }

    public boolean push(int value){
        if (size >= capacity){
            return false;
        }
        data[size] = value;
        size++;
        return true;
    }

    public int pop(){
        if (size == 0){
            throw new RuntimeException();
        }

        return data[--size];
    }
}
