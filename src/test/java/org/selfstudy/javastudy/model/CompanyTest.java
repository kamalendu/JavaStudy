package org.selfstudy.javastudy.model;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class CompanyTest {

    private final Company COMPANY = new Company("Indimade",new Address("Siva street","Dallas",State.TX,888088), 123L);
    @Test
    public void testGetName() {
        Assert.assertEquals("Indimade",COMPANY.getName());
    }
    @Test
    public void testNameNotNullable() {
        Company company1 = new Company(null,new Address("Siva street","Dallas",State.TX,888088), 123L);
        // validate the input
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        var violations = validator.validate(company1);
        Assert.assertTrue(violations.size()==1);
    }
}