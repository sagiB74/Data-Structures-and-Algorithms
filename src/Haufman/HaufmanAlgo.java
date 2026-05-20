package Haufman;

import java.util.HashMap;
import java.util.Map;

public class HaufmanAlgo {
    private Node root;

    public HaufmanAlgo(Map<Character , Integer> frequencies){
        this.root = BuildTree(frequencies);
    }

    private Node BuildTree(Map<Character, Integer> frequencies) {
        MinHeap heap = new MinHeap();
        for (Map.Entry<Character , Integer> entry : frequencies.entrySet()){
            char c = entry.getKey();
            int num = entry.getValue();
            Node node = new Node(c , num);
            heap.insert(node);
        }

        while (heap.size() > 1){
            Node node1 = heap.extractMin();
            Node node2 = heap.extractMin();
            int newVal = node1.getFreq() + node2.getFreq();

            Node newNode = new Node(newVal , node1 , node2);
            heap.insert(newNode);


        }
        return heap.extractMin();
    }

    public Map<Character , String> GenerateCode(){
        Map<Character , String> codes = new HashMap<>();
        if (this.root != null){
            calcCode(this.root , "" , codes);
        }


        return codes;
    }


    private void calcCode(Node root, String s, Map<Character, String> codes) {
        if (root == null){
            return;
        }
        if (root.getLeft() == null && root.getRight() == null){
            codes.put(root.getName() , s);
            return;
        }
        calcCode(root.getLeft() , s + "0" , codes);
        calcCode(root.getRight() , s + "1" , codes);

    }
}
