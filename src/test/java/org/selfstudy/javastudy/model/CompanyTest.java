package org.selfstudy.javastudy.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {

    private Company company = new Company("Indimade",new Address("Siva street","Dallas",State.TX,888088), 123L);
    @Test
    public void getName() {
        Assert.assertEquals("Indimade",company.getName());
    }
}