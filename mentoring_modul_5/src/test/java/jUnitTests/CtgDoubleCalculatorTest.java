package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class CtgDoubleCalculatorTest extends ConfigJUnitTests{
    private double firstNumber;
    private double cotangent;

    public CtgDoubleCalculatorTest(double firstNumber, double cotangent){
        this.firstNumber = firstNumber;
        this.cotangent = cotangent;
    }

    @Parameterized.Parameters(name = "{index}:ctgOf({0})={1}")
    public static Iterable<Object[]> valuesForCtgOperations() {
        return Arrays.asList(new Object[][]{
                {15.25, Math.tanh(15.25)},
                {666.25, Math.tanh(666.25)},
                {-15.0, Math.tanh(-15.0)},
                {0.0, Math.tanh(0.0)}
        });
    }

    @Test
    public void longCtgTest(){
        Assert.assertEquals(cotangent, calculator.ctg(firstNumber), 0.0000);
    }
}
