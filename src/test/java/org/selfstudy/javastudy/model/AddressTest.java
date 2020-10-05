package org.selfstudy.javastudy.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    private Address address = new Address("Siva street","Dallas",State.TX,888088);
    @Test
    public void getAddress() {
        Assert.assertEquals("Dallas",address.getCity());
    }
}