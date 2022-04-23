package com.random.prep.algos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    BinarySearch binarySearch;
    int[] array;
    int[] repArray;

    @Before
    public void init() {
        binarySearch = new BinarySearch();
        array = new int[] {1, 10, 20, 45, 132, 168, 172};
        repArray = new int[] {1, 2, 3, 3, 4, 5,6};
    }

    @Test
    public void binarySearchNormalTest() {
        int indexToFind = binarySearch.binarySearch(172, array, 0, array.length - 1);
        Assert.assertEquals(6, indexToFind);
        int indexToFind2 = binarySearch.binarySearch(1, array, 0, array.length - 1);
        Assert.assertEquals(0, indexToFind2);
        int indexToFind3 = binarySearch.binarySearch(20, array, 0, array.length - 1);
        Assert.assertEquals(2, indexToFind3);
    }

    @Test
    public void findRepeatingElementTest() {
        int repElement = binarySearch.findRepeatingElement(repArray, 0, repArray.length - 1);
        Assert.assertEquals(3, repArray[repElement]);
    }


}
