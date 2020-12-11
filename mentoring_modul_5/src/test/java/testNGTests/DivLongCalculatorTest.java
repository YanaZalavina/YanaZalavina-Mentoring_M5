package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.FileAssert.fail;

public class DivLongCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForDivOperations", groups = {"simpleOperations", "div"})
    public void longDivTest(long firstNumber, long secondNumber, long division){
        Assert.assertEquals(calculator.div(firstNumber, secondNumber), division, "Invalid result of div operation");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = {"simpleOperations", "div"})
    public void longDivByZeroErrorTest() {
        calculator.div(1L, 0L);
    }

    @Test(groups = {"simpleOperations", "div"})
    public void longDivByZeroErrorMessageTest() {
        try {
            calculator.div(1L, 0L);
            fail("There is should be an exception");
        }catch (Exception e){
            Assert.assertTrue(e instanceof NumberFormatException);
            Assert.assertEquals(e.getMessage(), "Attempt to divide by zero");
        }

    }

    @DataProvider(name = "valuesForDivOperations")
    public Object[][] valuesForDivOperations(){
        return new Object[][]{
                {12345678910L, 25L, 12345678910L/25L},
                {1500L, -25L, -1500L/25L},
                {-155447553L, -25L, -155447553L/-25L}
        };
    }
}
