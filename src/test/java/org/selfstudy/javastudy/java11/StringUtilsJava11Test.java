package org.selfstudy.javastudy.java11;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class StringUtilsJava11Test {

    @Test
    public void testIsEmpty(){
        String testStr = "   ", testStr1 = "Kamal";
        assertTrue(testStr+" is not blank", testStr.isBlank());
        assertFalse(testStr+" is empty",testStr.isEmpty());

        assertFalse(testStr1+" is blank", testStr1.isBlank());
        assertFalse(testStr1+" is empty",testStr1.isEmpty());
    }

    @Test
    public void testRepeat(){
        assertEquals("CPU Usage:                  5%",
                renderInfo("CPU Usage:", "5%",30));
    }

    private String renderInfo(String key, String value, int length) {
        return key+" ".repeat(length-(key.length()+value.length()))+value;
    }

    @Test
    public void testStrip(){
        assertEquals(" Kamal".stripLeading(),("Kamal"));
        assertEquals(" Kamal ".strip(),"Kamal");
        assertEquals("Kamal ".stripTrailing(),"Kamal");

    }
}