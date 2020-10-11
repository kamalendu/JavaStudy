package org.selfstudy.javastudy.java11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtilsJava11Test {
    @Test
    public void testListToArray(){
        List<String> strList = new ArrayList<>();
        strList.add("Bhola");
        strList.add("Shiva");
        strList.add("Sambhu");
        Assert.assertArrayEquals(new String[]{"Bhola","Shiva","Sambhu"},strList.toArray(new String[strList.size()]));
        Assert.assertArrayEquals(new String[]{"Bhola","Shiva","Sambhu"},strList.toArray(String[]::new));

    }
}
