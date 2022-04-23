package com.random.prep.trees;

import com.random.prep.trees.BinarySearchTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree binarySearchTree;
    @Before
    public void init() {
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    public void insert() {
        Assert.assertTrue(binarySearchTree.insertToBST(15));
        Assert.assertTrue(binarySearchTree.insertToBST(11));
        Assert.assertTrue(binarySearchTree.insertToBST(19));
        Assert.assertTrue(binarySearchTree.insertToBST(10));
        Assert.assertTrue(binarySearchTree.insertToBST(31));
        binarySearchTree.inOrder();

        System.out.println(binarySearchTree.searchBST(10));
    }

}
