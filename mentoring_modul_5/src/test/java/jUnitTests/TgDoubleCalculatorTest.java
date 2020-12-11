package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TgDoubleCalculatorTest extends ConfigJUnitTests{
    private double firstNumber;
    private double tangent;

    public TgDoubleCalculatorTest(double firstNumber, double tangent){
        this.firstNumber = firstNumber;
        this.tangent = tangent;
    }

    @Parameterized.Parameters(name = "{index}:tgOf({0})={1}")
    public static Iterable<Object[]> valuesForTgOperations() {
        return Arrays.asList(new Object[][]{
                {15.25, Math.tan(15.25)},
                {34634.00, Math.tan(34634.00)},
                {-15.25, Math.tan(-15.25)}
        });
    }

    @Test
    public void longTgTest(){
        Assert.assertEquals(tangent, calculator.tg(firstNumber), 0.000000000);
    }
    @Test
    public void longTgTest_WHERE_COMPARE_WITH_SIN_DIV_COS(){
        Assert.assertEquals((calculator.sin(firstNumber)/calculator.cos(firstNumber)), calculator.tg(firstNumber),0.00);
    }
}
