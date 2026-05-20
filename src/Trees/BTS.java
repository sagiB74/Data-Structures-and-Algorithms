package Trees;

public class BTS {
    private TreeNode root;

    public BTS() {
        root = null;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean add(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return true;
        }
        return addRecursive(root, data);
    }

    private boolean addRecursive(TreeNode current, int data) {
        if (data < current.getData()) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode(data));
                return true;

            } else {
                return addRecursive(current.getLeft(), data);

            }
        } else {

            if (data > current.getData()) {
                if (current.getRight() == null) {
                    current.setRight(new TreeNode(data));
                    return true;
                } else {
                    return addRecursive(current.getRight(), data);
                }
            }

        }

        return false;
    }



    public TreeNode find(int data) {
        return findRecursive(root, data);
    }

    private TreeNode findRecursive(TreeNode current, int data) {
        if (current == null){
            return null;
        }
        if (data == current.getData()){
            return current;
        }
        if (data < current.getData()){
            return findRecursive(current.getLeft(),data);
        } else if (data > current.getData()) {
            return findRecursive(current.getRight(), data);

        }
        return null;
    }

    private TreeNode findLeftParent(TreeNode node){
        TreeNode current = root;
        TreeNode back = null;
        while (current != null) {
            if (node.getData() < current.getData()) {
                back = current;
                current = current.getLeft();
            } else if (node.getData() > current.getData()) {
                current = current.getRight();
            } else {
                break;
            }
        }
        return back;
    }

    private TreeNode findRightParent(TreeNode node){
        TreeNode current = root;
        TreeNode back = null;
        while (current != null) {
            if (node.getData() < current.getData()) {
                current = current.getLeft();
            } else if (node.getData() > current.getData()) {
                back = current;
                current = current.getRight();
            } else {
                break;
            }
        }
        return back;
    }

    // this methode return the next large node in the tree.
    public TreeNode successor(TreeNode node){
        if (node == null){
            return null;
        }
        if (node.getRight() == null){
            return findLeftParent(node);
        }
        TreeNode current = node.getRight();
        while (current.getLeft() != null){
            current = current.getLeft();
        }
        return current;
    }









    public boolean remove(TreeNode killMe){
        if (killMe == null || root == null){  // tree is empty
            return false;
        }

        TreeNode parent = findParent(killMe.getData());
        // killMe is leaf , case 1
        if (killMe.getLeft() == null && killMe.getRight() == null){
            if (parent == null){    // root is kiiMe
                root = null;

            } else if (parent.getLeft()== killMe) {
                parent.setLeft(null);
                
            }else {
                parent.setRight(null);;
            }
            return true;

        // node to be deleted has one child , case 2
        } else if (killMe.getLeft() == null || killMe.getRight() == null) {
            TreeNode child = (killMe.getLeft() != null) ? killMe.getLeft() : killMe.getRight();

            if (parent == null){
                root = child;
            } else if (parent.getLeft() == killMe) {
                parent.setLeft(child);

            } else if (parent.getRight() == killMe) {
                parent.setRight(child);

            }

            return true;


        }
        // killMe has 2 children , case 3
        else {
            TreeNode successor = successor(killMe);
            int successorValue = successor.getData();
            remove(successor);
            killMe.setData(successorValue);
            return true;

        }


    }


    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode node) {
        if (node == null) return;
        inOrderRec(node.getLeft());
        System.out.println(node.getData() + " ");
        inOrderRec(node.getRight());
    }

    public TreeNode findParent(int data){
        if (root == null){
            return null;
        }
        TreeNode current = root;
        TreeNode parent = null;

        while (current != null){
            if (data == current.getData()){
                return parent;
            }
            parent = current;

            if (data < current.getData()){
                current = current.getLeft();
            }else {
                current = current.getRight();
            }

        }
        return null;

    }
}













