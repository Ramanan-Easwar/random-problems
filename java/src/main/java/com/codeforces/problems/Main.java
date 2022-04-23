package com.codeforces.problems;

/*
*
["A","B","C","E"]
["S","F","C","S"]
["A","D","E","E"]


 word = "ABCCED"


 ["A","B","C","E"]
 ["S","F","C","S"]
 ["A","D","E","E"]
 * stack 1: E,E
 *
 * word: CBAS -> true

*
  word = "SEE"*/

public class Main {
    static int lengthOfArray = 7; //random
    static String str;
    static int[][] array = new int[lengthOfArray][lengthOfArray];

    static boolean find(int indexOne, int indexTwo, int indexString) {
        if(indexOne == lengthOfArray && indexTwo == lengthOfArray)
            return true;
        if(array[indexOne][indexTwo] == str.charAt(indexString)) {
            find(indexOne - 1, indexTwo, indexString+1);
            find(indexOne + 1, indexTwo, indexString+1);
            find(indexOne, indexTwo - 1, indexString+1);
            find(indexOne, indexTwo + 1, indexString+1);
        }
        return false;
    }

    public static void main(String[] args) {


    }
}


//queue -> submits the task
// listens to this queue and consumes

/*
*
* API user posts a link and process the csv
*
* /submit_link -> exposing the end point to the user pushed the queue
*
* /job_upate?user=1 -> GET csv
*
*
* */
