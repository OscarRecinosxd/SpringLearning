package com.mycompany.app.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
    private MyMath math;


    @Before
    public void setUp(){
        math = new MyMath();
    }

    @Test
    public void testFind0() {
        boolean result = math.Find0(new int[]{1,2,0,4,5});
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateSum() {
        int sum = math.calculateSum(new int[]{1,2,3,4,5});
        int expectedResult = 15;
        assertEquals(expectedResult, sum);
    }
}
