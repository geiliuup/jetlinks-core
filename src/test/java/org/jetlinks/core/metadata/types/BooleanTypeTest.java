package org.jetlinks.core.metadata.types;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanTypeTest {

    @Test
    public void test(){
        BooleanType booleanType=new BooleanType();

        Assert.assertEquals(booleanType.format(true),"是");
        Assert.assertEquals(booleanType.format(false),"否");

        Assert.assertTrue(booleanType.validate(false).isSuccess());
        Assert.assertTrue(booleanType.validate(true).isSuccess());

        Assert.assertTrue(booleanType.validate("false").isSuccess());
        Assert.assertTrue(booleanType.validate("true").isSuccess());

        Assert.assertTrue(booleanType.validate("是").isSuccess());
        Assert.assertTrue(booleanType.validate("否").isSuccess());

        Assert.assertFalse(booleanType.validate("1").isSuccess());
        Assert.assertFalse(booleanType.validate("2").isSuccess());

    }
}