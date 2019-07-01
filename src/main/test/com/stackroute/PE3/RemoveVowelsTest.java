package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels test;
    @Before
    public void setUp(){
        test=new RemoveVowels();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void testPositiveCase(){

        String[] result=test.remVow(new String[]{"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }

    @Test
    public void testRemoveVowelsGivenSingleString() {
        String[] result=test.remVow(new String[]{"aeiou"});
        assertArrayEquals(new String[]{"a"},result);
    }
    @Test
    public void testPositiveCaseNull(){

        String[] result=test.remVow(new String[]{"India","United States","Germany","Egypt",null});
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt"},result);
    }
    }


