package com.random.prep;

// calculates the longest palindrome of a string

/* dp formula: (x, y) =
 * IF(str(x) == str(y) && dp(x+1)(y-1) is true i.e.
 * the substr expect last and first word should be true
 */

public class LongestSubstring {

    static String strToCheck = "racecar";

    // prints the string
    public static void printString(int start, int end) {
        for(int i = start; i <= end; ++i) {
            System.out.print(strToCheck.charAt(i));
        }
    }

    public static int LPS() {
        int n = strToCheck.length();
        System.out.println(n);
        int start = 0;
        boolean[][] dynamicProgArray = new boolean[n][n];
        // populate all single letter words
        int maxLength = 1;
        for(int i =0; i < n; ++i ) {
            dynamicProgArray[i][i] = true;
        }
        // for words with length 2
        for(int i = 0; i < n - 1; ++i) {
            if(strToCheck.charAt(i) == strToCheck.charAt(i + 1)) {
                dynamicProgArray[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // checking for words greater than 2 (i.e. 3, 4, 5..n) as 1 & 2 are already done
        // here: gap is the size of the substr to check
        for(int gap = 3; gap <= n; ++gap) {
            // i should be always less than the (total length - gap) +1 for index

            for(int i = 0; i < (n - gap + 1); ++i) {
                /* so first iteration is {(0,2), (1,3), (2,4)} size is 3
                 *  next iteration is {(0,3), (1,4)..} size is 4
                 */
                int j = (i + gap - 1);
                if((strToCheck.charAt(i) == strToCheck.charAt(j)) && dynamicProgArray[i+1][j-1]) {
                    dynamicProgArray[i][j] = true;
                    // to get the max length of newly added array and the end points
                    if(gap > maxLength) {
                        start = i;
                        maxLength = gap;
                    }
                }
            }
        }
        System.out.print("ans is: ");
        printString(start, (start + maxLength - 1));

        return 0;
    }

    public static void main(String[] args) {
        LongestSubstring.LPS();
    }

}
