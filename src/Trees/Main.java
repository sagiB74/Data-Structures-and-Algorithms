package Trees;

public class Main {
    static void main(String[] args) {


        BTS treeNode = new BTS();
        treeNode.add(30);
        treeNode.add(18);
        treeNode.add(25);
        treeNode.add(15);
        treeNode.add(19);
        treeNode.add(35);
        treeNode.add(34);
        treeNode.add(40);
        treeNode.add(17);
        treeNode.add(28);
        treeNode.inOrder();
        System.out.println("parent of 20: " + treeNode.findParent(28));
        System.out.println("the number after 28 is: " + treeNode.successor(treeNode.find(28)));
        treeNode.remove(treeNode.find(21));
        treeNode.inOrder();



    }
}
