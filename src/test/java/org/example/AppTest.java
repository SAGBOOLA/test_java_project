package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    CalcOperators operators = new CalcOperators();
    @Test
    public void addTest(){
        int[] inputs = {1,2,3};
        int actual = operators.add(inputs);
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void subtractTest(){
        int[] inputs = {5,6,2,4};
        int actual = operators.subtract(inputs);
        int expected = -7;
        assertEquals(expected,actual);
    }
    @Test
    public void multiplyTest(){
        int[] inputs = {2,15,7,40};
        int actual = operators.multiply(inputs);
        int expected = 8400;
        assertEquals(expected,actual);
    }
    @Test
    public void divideTest(){
        int [] inputs = {5,0};
        int actual = operators.divide(inputs);
        int expected = 0;
        assertEquals(expected,actual);
    }

}
