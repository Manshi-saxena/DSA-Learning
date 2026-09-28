package BinaryTree;

public class structureTree {

    // Node class
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {

        // Both are null
        if (node == null && subRoot == null) {
            return true;
        }

        // One is null OR values are different
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        // Check left subtree
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        // Check right subtree
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    // Check if subRoot is a subtree of root
    public static boolean isSubtree(Node root, Node subRoot) {

        // Empty subtree is always a subtree
        if (subRoot == null) {
            return true;
        }

        // Main tree is empty but subtree is not
        if (root == null) {
            return false;
        }

        // If values match, check complete tree
        if (root.data == subRoot.data) {

            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Search in left subtree
        boolean leftAns = isSubtree(root.left, subRoot);

        // Search in right subtree
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;
    }

    public static void main(String[] args) {

        // Main Tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Subtree
        Node subRoot = new Node(2);

        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // Check subtree
        System.out.println(isSubtree(root, subRoot));
    }
}