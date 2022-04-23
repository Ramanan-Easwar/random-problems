package com.random.prep.algos;

import java.math.BigInteger;

/*
* This code is to generate the power of any
* give two (n, x) in log n time
*/
public class PowerLogn {

    // O(N)
    public int powOofN(int x, int n) {
        if(n == 0)
            return 1;
        else if (n % 2 == 0)
            return powOofN(x, n/2) * powOofN(x, n/2); // 3^4 = (3^2) * (3^2)
        else
            return x * powOofN(x, n/2) * powOofN(x, n/2); // this is for 3^5= (3) * (3^2) * (3^2)
    }

    //O(logN)
    // this method pushes all the n, n/2, (n/2)/2... till 0 to a stack and
    // then pop them out while multiplying based on odd or even
    public int powLogn(int x, int n) {
        if(n == 0)
            return 1;
        int temp = powLogn(x, n/2);
        if(n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

}
