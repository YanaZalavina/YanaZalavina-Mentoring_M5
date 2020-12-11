package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class SqrtDoubleCalculatorTest extends ConfigJUnitTests{
    private double number;
    private double squareRoot;

    public SqrtDoubleCalculatorTest(double number, double squareRoot){
        this.number = number;
        this.squareRoot = squareRoot;
    }

    @Parameterized.Parameters(name = "{index}:sqrtOf({0})={1}")
    public static Iterable<Object[]> valuesForSqrtOperations() {
        return Arrays.asList(new Object[][]{
                {15.25, Math.sqrt(15.25)},
                {666.25, Math.sqrt(666.25)},
                {-15.0, Math.sqrt(Math.abs(-15.0))},
                {0.0, Math.sqrt(0.0)}
        });
    }

    @Test
    public void longSqrtTest(){
        Assert.assertEquals(squareRoot, calculator.sqrt(number), 0.0000);
    }
}
