package com.random.prep.algos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerLognTest {
    PowerLogn powerLogn;
    @Before
    public void init() {
        powerLogn = new PowerLogn();
    }

    @Test
    public void powerNTest() {
        Assert.assertEquals(32, powerLogn.powOofN(2,5));
    }
    @Test
    public void powerLognTest() {
        Assert.assertEquals(32, powerLogn.powOofN(2,5));
    }
}
