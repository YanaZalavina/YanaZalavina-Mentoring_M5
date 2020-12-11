package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForMultOperations", groups = {"simpleOperations", "mult"})
    public void longMultTest(long firstNumber, long secondNumber, long multiplication){
        Assert.assertEquals(calculator.mult(firstNumber, secondNumber), multiplication, "Invalid result of mult operation");
    }

    @DataProvider(name = "valuesForMultOperations")
    public Object[][] valuesForMultOperations(){
        return new Object[][]{
                {12345678910L, 25L, 308641972750L},
                {15L, -25L, -375L},
                {-15L, -25L, 375L},
                {0L, 0L, 0L}
        };
    }
}
