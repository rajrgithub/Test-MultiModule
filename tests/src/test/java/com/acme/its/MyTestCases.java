package com.acme.its;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;


public class MyTestCases {

   @Test
    public void test_JUnit() {
        System.out.println("This is the testcase in this class");
        String str1="This is the NEW testcase in this class";
        //assertEquals("This is the testcase in this class", str1);
        assertEquals("This is the NEW testcase in this class", str1);
    }
    
}



