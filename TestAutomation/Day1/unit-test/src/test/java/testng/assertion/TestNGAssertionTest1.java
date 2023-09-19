package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {

    @Test
    public void testAssertEquals() {
        String actualValue = "Hello TestNG";
        System.out.println("Prior to Assertion");
        Assert.assertEquals(actualValue,"Hello TstNG","Failed - String mismatch");
        System.out.println("After Assertion");

    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Hello TestNG";
        Assert.assertNotEquals(actualValue,"Hello TeNG","Error");
    }

    @Test
    public void testAssertTrue() {
        boolean isActualValue = false;
        Assert.assertTrue(isActualValue,"Failed - Boolean mismatch");

    }

    @Test
    public void testAssertFalse() {
        boolean isActualValue = false;
        Assert.assertFalse(isActualValue,"Failed - Boolean mismatch");

        }
    }

