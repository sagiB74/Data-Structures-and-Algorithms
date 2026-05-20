//question 5
// Shelley Monis ID: 213788433 , Sagi Benilush ID: 322566845

package EXE_3;

import java.util.*;



public class KthSmallestO1Template {




    public static int kthSmallestO1(TreeNode root, int k) {


        TreeNode curr = root;
        int count = 0;

        while (curr != null) {


            if (curr.left == null) {
                count++;
                if (count == k)
                    return curr.val;

                curr = curr.right;
            }


            else {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // יצירת קישור זמני
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }


                else {
                    pred.right = null;   // מחיקת הקישור
                    count++;
                    if (count == k)
                        return curr.val;

                    curr = curr.right;
                }
            }
        }

        throw new UnsupportedOperationException("Implement kthSmallestO1");
    }

    /* ========================= Provided: Tree Node ========================= */

    /** Basic BST node. */
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { this.val = v; }
    }

    /* ========================= Provided: Utilities ========================= */

    /** Insert value into BST (iterative). Duplicates go to the right for consistency. */
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode cur = root;
        while (true) {
            if (val < cur.val) {
                if (cur.left == null) { cur.left = new TreeNode(val); break; }
                cur = cur.left;
            } else {
                if (cur.right == null) { cur.right = new TreeNode(val); break; }
                cur = cur.right;
            }
        }
        return root;
    }

    /** Build BST from array of values. */
    public static TreeNode buildBST(int[] values) {
        TreeNode root = null;
        for (int v : values) root = insert(root, v);
        return root;
    }

    /** Inorder traversal (recursive) only for printing/verification (not part of the O(1) task). */
    public static List<Integer> inorder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderRec(root, res);
        return res;
    }

    private static void inorderRec(TreeNode n, List<Integer> res) {
        if (n == null) return;
        inorderRec(n.left, res);
        res.add(n.val);
        inorderRec(n.right, res);
    }

    /* ========================= Demo (prints only) ========================= */

    public static void main(String[] args) {
        // Example BST:
        // values will produce BST with inorder sorted order.
        int[] values = {7, 4, 9, 2, 5, 10, 1, 3, 6, 8};
        TreeNode root = buildBST(values);

        // Show inorder to confirm sorted sequence (students can compare with kthSmallestO1 outputs)
        List<Integer> in = inorder(root);
        System.out.println("Inorder (sorted): " + in);

        // Example k values to try after students implement kthSmallestO1:
        int[] ks = {1, 3, 5, 7, 10};
        System.out.println("Try k values (expected are inorder[k-1]): " + Arrays.toString(ks));
//         Uncomment after implementation:
         for (int k : ks) {
             int ans = kthSmallestO1(root, k);
             System.out.printf("k=%d -> %d (expected %d)%n", k, ans, in.get(k - 1));
         }
    }
}
