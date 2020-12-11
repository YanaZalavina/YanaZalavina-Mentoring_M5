package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class PowDoubleCalculatorTest extends ConfigJUnitTests{
    private double number;
    private double degree;
    private double inPower;

    public PowDoubleCalculatorTest(double number, double degree, double inPower){
        this.number = number;
        this.degree = degree;
        this.inPower = inPower;
    }

    @Parameterized.Parameters(name = "{index}:powOf({0}^{1})={2}")
    public static Iterable<Object[]> valuesForPowOperations() {
        return Arrays.asList(new Object[][]{
                {15.25, 2.0, Math.pow(15.25, 2.0)},
                {666.25, -0.005, Math.pow(666.25, Math.floor(-0.005))},
                {-15.0, 0.02, Math.pow(-15.0, Math.floor(0.02))},
                {-15.0, -0.01, Math.pow(-15.0, Math.floor(-0.01))},
                {0.0, 4.0, Math.pow(0.0, 4.0)},
                {0.0, -4.0, Math.pow(0.0, -4.0)},
                {15.0, 0.0, Math.pow(15.0, 0.0)},
                {-15.0, 0.0, Math.pow(-15.0, 0.0)},
        });
    }

    @Test
    public void longPowTest(){
        Assert.assertEquals(inPower, calculator.pow(number, degree), 0.00000000);
    }
}
