package com.acme.its;

import com.acme.module1.Module1;
import com.acme.module2.Module2;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModulesTest {

  @Test
  public void integrationTest1() {
    new Module1().coveredByIntegrationTest();
  }

  @Test
  public void integrationTest2() {
    new Module2().coveredByIntegrationTest();
  }
  
  /*
    @Test
    public void test_JUnit() {
        System.out.println("SUCCESS Test Case");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
    }
    
    @Test
    public void fail_test_JUnit() {
        System.out.println("FAILURE Test Case");
        String str1="Test for fail case";
        assertEquals("This is the testcase in this class", str1);
    } 
     */   
}
