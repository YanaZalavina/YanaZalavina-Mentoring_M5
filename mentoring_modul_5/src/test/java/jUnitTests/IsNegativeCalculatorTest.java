package jUnitTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsNegativeCalculatorTest extends ConfigJUnitTests{
    public List<Long> listOfValues  = new ArrayList<Long>(Arrays.asList(26787L, -26787L, 0L));

    @Test
    public void longIsNegativeTest_WHEN_NUMBER_IS_POSITIVE_RESULT_SHOUID_BE_FALSE(){
        Assert.assertFalse("This is positive number: "+listOfValues.get(0), calculator.isNegative(listOfValues.get(0)));
    }
    @Test
    public void longIsNegativeTest_WHEN_NUMBER_IS_NEGATIVE_RESULT_SHOUID_BE_TRUE(){
        Assert.assertTrue("This is negative number: "+listOfValues.get(1), calculator.isNegative(listOfValues.get(1)));
    }
    @Test
    public void longIsNegativeTest_WHEN_NUMBER_IS_ZERO_RESULT_SHOUID_BE_FALSE(){
        Assert.assertFalse("This is zero number: "+listOfValues.get(2), calculator.isNegative(listOfValues.get(2)));
    }
}
