package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForMultOperations", groups = {"simpleOperations", "mult"})
    public void doubleMultTest(double firstNumber, double secondNumber, double multiplication){
        Assert.assertEquals(calculator.mult(firstNumber, secondNumber), multiplication, "Invalid result of mult operation");
    }

    @DataProvider(name = "valuesForMultOperations")
    public Object[][] valuesForMultOperations(){
        return new Object[][]{
                {15.25, 25.5, Math.floor(15.25 * 25.5)},
                {15.25, -25.5, Math.floor(15.25 * -25.5)},
                {-15.25, -25.5, Math.floor(-15.25 * -25.5)},
                {0.0, 0.0, Math.floor(0 * 0)}
        };
    }
}
