package Haufman;

public class Node implements Comparable<Node> {
    private char name;
    private int freq;
    private Node left;
    private Node right;

    public Node(char name , int freq){
        this.name = name;
        this.freq = freq;
        left = null;
        right = null;
    }

    public Node(int freq , Node left , Node right){
        this.freq = freq;
        this.left = left;
        this.right = right;
    }


    public int getFreq(){
        return freq;
    }

    Node getLeft(){
        return left;
    }
    Node getRight(){
        return right;
    }

    char getName(){
        return name;
    }


    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.freq , o.freq);
    }
}
