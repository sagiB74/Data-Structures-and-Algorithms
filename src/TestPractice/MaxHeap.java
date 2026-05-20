package TestPractice;

public class MaxHeap {
    private int[] data;
    private int size;
    private int capacity;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int val){
        if (size < capacity){
            data[++size] = val;
            HeapifyUp(size);
        }
    }

    private void HeapifyUp(int index) {
        while (index > 0){
            int parent = (index -1) /2;
            if (data[index] > data[parent]){
                int temp = data[parent];
                data[parent] = data[index];
                data[index] = temp;
                index = parent;
            }
        }


    }

    public void HeapifyDown(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException();
        }

        while (true) {

            int LeftChild = (index * 2) + 1;
            int RightChild = (index * 2) + 2;

            if (LeftChild >= size){
                break;

            }
            int child = LeftChild;
            if (RightChild < size && RightChild > LeftChild){
                child = RightChild;
            }
            if (data[child] > data[index]){
                int temp = data[child];
                data[child] = data[index];
                data[index] = temp;
                index = child;
            }

        }


    }
}
