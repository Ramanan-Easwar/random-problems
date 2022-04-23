package com.random.prep;

public class LongestCommonSubstring {
    static String stringOne = "racecar";
    static String stringTwo = "race";


    public static int LCS(int x, int y, int count) {
        if(x == 0 || y == 0)
            return count;
        if(stringOne.charAt(x - 1) == stringTwo.charAt(y - 1))
            count = LCS(x - 1, y - 1, count + 1);
        count = Math.max(count, Math.max(LCS(x, y-1, 0), LCS(x-1, y, 0)));
        return count;
    }

    public static void main(String[] args) {
        System.out.println(LongestCommonSubstring.LCS(6, 4,0));
    }

}
