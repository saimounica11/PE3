package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard test;
    @Before
    public void setUp(){
        test=new ChessBoard();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void PositiveTestCase(){
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String [][] result=test.boardDisplay(8,8);
        assertEquals(expected,result);
    }
    @Test
    public void method(){
        String[][] result=test.boardDisplay(2,2);
        assertArrayEquals(new String[][]{{"WW","BB"},{"BB","WW"}},result);
    }
    @Test
    public void testMethodWithZeros(){
        String[][] result=test.boardDisplay(0,0);
        assertArrayEquals(new String[][]{},result);
    }
    @Test
    public void testMethodWithNeagitiveValues(){
        String[][] result=test.boardDisplay(-1,0);
        assertArrayEquals(new String[][]{},result);
    }
}