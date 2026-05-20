package Haufman;
import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Node> heap;

    public MinHeap(){
        this.heap = new ArrayList<>();
    }

    private int getParentIndex(int i){
        return (i - 1)/2;
    }

    private int getLeftChild(int i){
        return (i * 2) + 1;
    }

    private int getRightChild(int i){
        return (i * 2) + 2;
    }

    private void swap(int index1 , int index2){
        Node temp = heap.get(index1);
        heap.set(index1 , heap.get(index2));
        heap.set(index2 , temp);


    }

    // הוספת איבר חדש
    public void insert(Node node) {
        heap.add(node);
        int index = heap.size() -1;
        while (index > 0){
            int parent = getParentIndex(index);
            Node currentNode = heap.get(index);
            Node fatherNode = heap.get(parent);
            if (currentNode.compareTo(fatherNode) < 0){
                swap(index , parent);
                index = parent;

            }else{
                break;
            }

        }
    }

    // שליפת המינימום (השורש)
    public Node extractMin() {
        Node root = heap.getFirst();
        heap.set(0 , heap.getLast());
        heap.removeLast();
        int index = 0;
        while (true){
            int left = getLeftChild(index);
            int right = getRightChild(index);
            if (left >= heap.size()){
                break;
            }
            int child = left;
            if (right < heap.size()){
                if (heap.get(right).compareTo(heap.get(child)) < 0){
                    child = right;
                }
            }
            if (heap.get(index).compareTo(heap.get(child)) > 0){
                swap(index , child);
                index = child;
            }else {
                break;
            }
        }
        return root;

    }




        public int size() {
        return heap.size();
    }
}
