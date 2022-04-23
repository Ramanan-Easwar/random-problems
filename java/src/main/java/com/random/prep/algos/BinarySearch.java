package com.random.prep.algos;


public class BinarySearch {

    public int binarySearch(int element, int[] array, int start, int end) {
        int mid = (end + start) / 2;
        if(element == array[mid]) {
            return mid;
        }
        else if (array[mid] > element) {
            return binarySearch(element, array, start, mid - 1);
        }
        else {
            return binarySearch(element, array, mid+1, end);
        }
    }

    public int findRepeatingElement(int[] array, int start, int end) {
        if(start > end)
            return -1;
        int mid = (end + start) / 2;
        // the repeating element has been crossed because if the
        // repeating element was not present, arr[i] == i+1 always
        if(array[mid] != mid + 1) {
            if(mid > 0 && array[mid] == array[mid -1])
                return mid;
            else {
                // we have to search in the left because we have
                // crossed the repeating element now!
                return findRepeatingElement(array, start, mid - 1);
            }
        }
        // the repeating element has not been crossed, yet
        // Thus we do a binary search on the right
        return findRepeatingElement(array, mid+1, end);

    }
}
