package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPositiveCalculatorTest extends ConfigJUnitTests{
    public List <Long> listOfValues  = new ArrayList<Long>(Arrays.<Long>asList(26787L, -26787L, 0L));

    @Test
    public void longIsPositiveTest_WHEN_NUMBER_IS_POSITIVE_RESULT_SHOUID_BE_TRUE(){
        Assert.assertTrue("This is positive number: "+listOfValues.get(0), calculator.isPositive(listOfValues.get(0)));
    }
    @Test
    public void longIsPositiveTest_WHEN_NUMBER_IS_NEGATIVE_RESULT_SHOUID_BE_FALSE(){
        Assert.assertFalse("This is negative number: "+listOfValues.get(1), calculator.isPositive(listOfValues.get(1)));
    }
    @Test
    public void longIsPositiveTest_WHEN_NUMBER_IS_ZERO_RESULT_SHOUID_BE_FALSE(){
        Assert.assertFalse("This is zero number: "+listOfValues.get(2), calculator.isPositive(listOfValues.get(2)));
    }
}
