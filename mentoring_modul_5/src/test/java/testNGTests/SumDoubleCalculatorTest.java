package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest extends ConfigTestNGTests {
    @Test(dataProvider = "valuesForSumOperations", groups = {"simpleOperations", "sum"})
    public void doubleSumTest(double firstNumber, double secondNumber, double sum){
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber),sum, "Invalid result of sum operation");
    }
    @DataProvider(name = "valuesForSumOperations")
    public Object[][] valuesForSumOperations(){
        return new Object[][]{
                {15.25, 25.5, 40.75},
                {15.25, -25.5, -10.25},
                {-15.25, -25.5, -40.75},
                {0.0, 0.0, 0.0}
        };
    }
}
