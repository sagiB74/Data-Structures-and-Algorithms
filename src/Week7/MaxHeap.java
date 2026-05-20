package Week7;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }


    public MaxHeap(int [] arr) {
        heap = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            heap[i] = arr[i];



        }
        size = arr.length;
        buildHeap();
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void insert(int num){
        if (size == capacity){
            throw new RuntimeException();
        }
        heap[size] = num;
        int i = size;
        size++;

       HeapifyUp(i);


    }


    private void HeapifyUp(int index){

        while (index > 0){
        int parent = (index - 1)/2;
            if (heap[parent] >= heap[index]){
                break;
            }
            int temp = heap[parent];
            heap[parent] = heap[index];
            heap[index] = temp;
            index = parent;
        }

    }

    public int peek(){
        return heap[0];
    }

    public int extractMax(){
        int max = heap[0];
        int temp = heap[size-1];
        heap[size -1] = max;
        heap[0] = temp;
        size--;
        heapifyDownRec(0);





        return max;
    }


    private void heapifyDownRec(int index){
        int left = (2 * index) +1;
        int right = (2 * index) +2;
        if (left >= size){
            return;
        }
        int child = left;
        if (right < size && heap[right] > heap[left]){
            child = right;
        }


        if (heap[index] >= heap[child]){
            return;
        }else {
            int temp = heap[child];
            heap[child] = heap[index];
            heap[index] = temp;

            heapifyDownRec(child);
        }

    }

    private void HeapifyDown(int index) {
        if (index < 0 || index >= size){
            throw new IllegalArgumentException();
        }

        while (true){
            int left = (2 * index) +1;
            int right = (2 * index) +2;


            // no children
            if (left >= size){
                break;
            }

            int child = left;
            if (right < size){
                if (heap[right] > heap[left]){
                    child = right;
                }
            }

            if (heap[index] >= heap[child]){
                break;
            }else {
                int temp = heap[child];
                heap[child] = heap[index];
                heap[index] = temp;
                index = child;

            }
        }
    }

    private void buildHeap(){
        for (int i = size/2 -1 ; i >= 0 ; i--){
            HeapifyDown(i);
        }
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(heap[i]);
            sb.append(" ");

        }
        sb.append("]");
        return sb.toString();

    }


}
