package jUnitTests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class SubLongCalculatorTest extends ConfigJUnitTests{
    private long firstNumber;
    private long secondNumber;
    private long subtraction;

   public SubLongCalculatorTest(long firstNumber, long secondNumber, long subtraction){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.subtraction = subtraction;
    }

    @Parameterized.Parameters(name = "{index}:subOf({0}-{1})={2}")
    public static Iterable<Object[]> valuesForSubOperations() {
        return Arrays.asList(new Object[][]{
                {12345678910L, 25L, 12345678885L},
                {15L, -25L, 40L},
                {-15L, -25L, 10L},
                {0L, 0L, 0L}
        });
    }

    @Test
    public void longSumTest(){
        Assert.assertEquals(subtraction, calculator.sub(firstNumber, secondNumber));
    }

}
