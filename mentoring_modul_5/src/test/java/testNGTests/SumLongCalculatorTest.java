package testNGTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalculatorTest extends ConfigTestNGTests {
    @Test(dataProvider = "valuesForSumOperations", groups = {"simpleOperations", "sum"})
    public void longSumTest(long firstNumber, long secondNumber, long sum){
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber), sum, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumOperations")
    public Object[][] valuesForSumOperations(){
        return new Object[][]{
                {12345678910L, 25L, 12345678935L},
                {15L, -25L, -10L},
                {-15L, -25L, -40L},
                {0L, 0L, 0L}
        };
    }
}
