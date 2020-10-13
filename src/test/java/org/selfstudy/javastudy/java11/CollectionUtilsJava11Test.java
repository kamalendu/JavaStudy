package org.selfstudy.javastudy.java11;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    @Test
    public void testPredicateNot(){
        List<String> months = List.of("Jan","May","Aug","Dec");
        List<String> mnList1 = months.stream().filter(str -> !str.startsWith("M")).collect(Collectors.toList());
        List<String> mnList2 = months.stream().filter(((Predicate<String>) str -> str.startsWith("M")).negate()).collect(Collectors.toList());
        List<String> mnList3 = months.stream().filter(Predicate.not(str -> str.startsWith("M"))).collect(Collectors.toList());

        Assert.assertEquals(mnList1,mnList2);
        Assert.assertEquals(mnList1,mnList3);
    }

    @Test
    public void testVarInLambda(){
        List<String> months = new ArrayList<>();
        months.addAll(List.of("Jan","May","Aug","Dec"));
        Assert.assertEquals(months.stream().filter( Predicate.not((var str) -> str.startsWith("M"))).collect(Collectors.toList()).size(),3);
    }

}
