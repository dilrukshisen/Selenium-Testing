package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest2 {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test
    public void testSum1() {
        Assert.assertEquals(calc.sum(0,-1),-1);


    }

    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(0,1),100);
    }

    @Test
    public void testSum3() {
        Assert.assertEquals(calc.sum(5,10),15);

    }
    @Test
    public void testSum4() {
        Assert.assertEquals(calc.sum(-5,-10),-15);
    }

}
