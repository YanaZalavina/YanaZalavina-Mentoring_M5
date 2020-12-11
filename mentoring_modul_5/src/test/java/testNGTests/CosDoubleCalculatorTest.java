package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosDoubleCalculatorTest extends ConfigTestNGTests{
    @Test(dataProvider = "valuesForCosOperations", groups = {"complexOperations", "cos"})
    public void doubleCosTest(double number, double cos){
        Assert.assertEquals(calculator.cos(number), cos, "Invalid result of cos operation");
    }
    @DataProvider(name = "valuesForCosOperations")
    public Object[][] valuesForCosOperations(){
        return new Object[][]{
                {15.25, Math.cos(15.25)},
                {25.5, Math.cos(25.5)},
                {-40.75, Math.cos(-40.75)},
                {0.0, Math.cos(0.0)}
        };
    }
}
