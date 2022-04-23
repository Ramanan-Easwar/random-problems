package com.random.prep.trees;

import javax.swing.text.html.Option;
import java.util.Optional;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    /*this is where the insertion happens;
    * call happens via the helper function*/
    private Node insert(Node node, int val) {
        if(node == null) {
            node = new Node(val);
            return node;
        }
        else if (node.value > val)
            node.left = insert(node.left, val);
        else if(node.value < val)
            node.right = insert(node.right, val);
        return node;

    }

    private boolean search(Node node, int val) {
        if(node == null)
            return false;
        else if(node.value == val)
            return true;
        else if (node.value > val)
            return search(node.left, val);
        else
            return search(node.right, val);
    }

    private void inOrder(Node node) {
        if(node == null)
            return;
        if(node.left != null)
            inOrder(node.left);
        System.out.print(node.value + "|");
        if(node.right != null)
            inOrder(node.right);
    }

    public boolean insertToBST(int val) {

        Optional<Node> returnVal = Optional.of(insert(this.root, val));
        this.root = returnVal.get();
        return true;
    }

    public boolean searchBST(int val) {
        return search(this.root, val);
    }

    public void inOrder() {
        inOrder(this.root);
    }




    private static class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }


}
