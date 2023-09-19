package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest4 {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test(dataProvider = "getData")
    public void testSum(int num1,int num2,int expectedResult) {
        Assert.assertEquals(calc.sum(num1,num2),expectedResult);

    }


    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {5, 10, 15},
                {0,1,1},
                {-5,-10,-15},
                {0,-1,-1}

        };
    }
}
