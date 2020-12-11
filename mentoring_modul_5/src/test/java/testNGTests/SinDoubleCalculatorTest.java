package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinDoubleCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForSinOperations", groups = {"complexOperations", "sin"})
    public void doubleSinTest(double number, double sin){
        Assert.assertEquals(calculator.sin(number),sin, "Invalid result of sin operation");
    }
    @DataProvider(name = "valuesForSinOperations")
    public Object[][] valuesForSinOperations(){
        return new Object[][]{
                {15.25, Math.sin(15.25)},
                {25.5, Math.sin(25.5)},
                {-40.75, Math.sin(-40.75)},
                {0.0, Math.sin(0.0)}
        };
    }
}
