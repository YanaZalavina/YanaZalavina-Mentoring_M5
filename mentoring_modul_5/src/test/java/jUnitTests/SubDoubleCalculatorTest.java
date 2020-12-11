package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class SubDoubleCalculatorTest extends ConfigJUnitTests{
    private double firstNumber;
    private double secondNumber;
    private double subtraction;

    public SubDoubleCalculatorTest(double firstNumber, double secondNumber, double subtraction){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.subtraction = subtraction;
    }

    @Parameterized.Parameters(name = "{index}:subOf({0}-{1})={2}")
    public static Iterable<Object[]> valuesForSubOperations() {
        return Arrays.asList(new Object[][]{
                {15.25, 25.5, -10.25},
                {15.25, -25.5, 40.75},
                {-15.25, -25.5, 10.25},
                {0.0, 0.0, 0.0}
        });
    }

    @Test
    public void longSumTest(){
        Assert.assertEquals(subtraction, calculator.sub(firstNumber, secondNumber),0.00);
    }
}
