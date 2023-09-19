package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest4 {


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }


    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
}
