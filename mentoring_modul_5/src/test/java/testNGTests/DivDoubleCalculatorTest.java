package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForDivOperations", groups = {"simpleOperations", "div"})
    public void doubleDivTest(double firstNumber, double secondNumber, double division){
        Assert.assertEquals(calculator.div(firstNumber, secondNumber), division, "Invalid result of div operation");
    }

    @Test(groups = {"simpleOperations", "div"})
    public void doublePositiveDivByZeroErrorTest() {
        try {
            Assert.assertNotEquals(calculator.div(1.0, 0.0), Double.POSITIVE_INFINITY, "There is should be NumberFormatException");
            //fail("There is should be an exception");
        }catch (Exception e){
            Assert.assertTrue(e instanceof NumberFormatException);
            Assert.assertEquals(e.getMessage(), "Attempt to divide by zero");
        }
    }
    @Test(groups = {"simpleOperations", "div"})
    public void doubleNegativeDivByZeroErrorTest() {
        try {
            Assert.assertNotEquals(calculator.div(1.0, 0.0), Double.NEGATIVE_INFINITY, "There is should be NumberFormatException");
        }catch (Exception e){
            Assert.assertTrue(e instanceof NumberFormatException);
            Assert.assertEquals(e.getMessage(), "Attempt to divide by zero");
        }
    }
    @Test(expectedExceptions = NumberFormatException.class, groups = {"simpleOperations", "div"})
    public void doubleDivByZeroErrorTest() {
        calculator.div(1.0, 0.0);
    }

    @DataProvider(name = "valuesForDivOperations")
    public Object[][] valuesForDivOperations(){
        return new Object[][]{
                {15.25, 25.5, (15.25 / 25.5)},
                {15.25, -25.5, (15.25 / -25.5)},
                {-15.25, -25.5, (-15.25 / -25.5)}
        };
    }
}
