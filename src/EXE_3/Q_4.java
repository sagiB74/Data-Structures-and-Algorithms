//question 4
// Shelley Monis ID: 213788433 , Sagi Benilush ID: 322566845

package EXE_3;
import Trees.TreeNode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_4 {



    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSThelper(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBSThelper(int[] nums, int l, int r) {
        if (l > r){
            return null;
        }
        int mid = l + (r - l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSThelper(nums,l,mid-1);
        root.right = sortedArrayToBSThelper(nums, mid+1, r);

        return root;

    }



    /* ========================= Provided: Tree Node ========================= */


    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            this.val = v;
        }
    }

    /* ========================= Provided: Pretty Print ========================= */


    public static void printTree(TreeNode root) {
        printTree(root, "", true);
    }

    // Internal helper: builds branches using prefixes
    private static void printTree(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) return;

        // Print right subtree first (so tree appears upright)
        printTree(node.right, prefix + (isLeft ? "│   " : "    "), false);

        // Print current node
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

        // Print left subtree
        printTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
    }


    public static void printTreeInline(TreeNode root) {
        List<String> lines = renderTreeLines(root);
        for (String line : lines) System.out.println(line);
    }

    // Render tree into lines using BFS levels (for inline display)
    private static List<String> renderTreeLines(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            result.add("(empty tree)");
            return result;
        }
        // BFS with null placeholders to keep structure
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        boolean hasNonNull = true;
        int maxWidth = 0;

        while (hasNonNull) {
            hasNonNull = false;
            StringBuilder sb = new StringBuilder();
            List<TreeNode> next = new ArrayList<>();

            for (TreeNode n : level) {
                if (n == null) {
                    sb.append(" . ");
                    next.add(null);
                    next.add(null);
                } else {
                    String s = String.valueOf(n.val);
                    sb.append(String.format(" %s ", s));
                    maxWidth = Math.max(maxWidth, s.length());
                    next.add(n.left);
                    next.add(n.right);
                    if (n.left != null || n.right != null) hasNonNull = true;
                }
            }

            result.add(sb.toString());
            level = next;
        }
        return result;
    }

    /* ========================= Demo (will show after student implements) ========================= */

    public static void main(String[] args) {
        // Example arrays to visualize
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-10, -3, 0, 5, 9};
        int[] nums3 = {2, 4, 6, 8};

        // Print arrays
        System.out.println("Array #1: " + Arrays.toString(nums1));
        System.out.println("Array #2: " + Arrays.toString(nums2));
        System.out.println("Array #3: " + Arrays.toString(nums3));
        System.out.println();

        // Build trees (after students implement sortedArrayToBST)
        TreeNode t1 = sortedArrayToBST(nums1);
        TreeNode t2 = sortedArrayToBST(nums2);
        TreeNode t3 = sortedArrayToBST(nums3);

        // Pretty print structures
        System.out.println("Tree for Array #1:");
        printTree(t1);
        System.out.println("\nTree for Array #2:");
        printTree(t2);
        System.out.println("\nTree for Array #3:");
        printTree(t3);

        // Optional inline compact view:
        System.out.println("\nInline view (Array #1):");
        printTreeInline(t1);
    }
}








