package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition test;
    @Before
    public void setUp(){
        test=new MatrixAddition();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void giventwomatrixReturnAddition(){
        int[][] expected = {{10, 9}, {9, 8}, {8, 7}};
        int M1[][] = {{1, 1}, {2, 2}, {3, 3}};
        int M2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = test.checkSum(3, 2, M1, M2);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void testAdditionFailure() {
        int[][] result=test.checkSum(2,2,new int[][]{{1,2},{3,4}},new int[][]{{9,8},{7,6}});
        assertArrayEquals(new int[][]{{10,10},{10,10}},result);
    }



}