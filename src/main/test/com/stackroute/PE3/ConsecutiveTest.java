package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive test;
    @Before
    public void setUp(){
        test=new Consecutive();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void givenConsecutiveInput(){
        String result=test.numCheck("51,52,53,54,55,56");
        assertEquals("consecutive numbers",result);

    }
    @Test
    public void givenNonConsecutiveInput(){
        String result=test.numCheck("50,52,65,71");
        assertEquals("non consecutive numbers",result);
    }
    @Test
    public void givenSamenumberInput(){
        String result=test.numCheck("60,60,60,60");
        assertEquals("non consecutive numbers",result);
    }


}