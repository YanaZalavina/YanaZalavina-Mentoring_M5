package jUnitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SubLongCalculatorTest.class, SubDoubleCalculatorTest.class,
        SqrtDoubleCalculatorTest.class,
        PowDoubleCalculatorTest.class,
        CtgDoubleCalculatorTest.class,
        IsPositiveCalculatorTest.class,
        IsNegativeCalculatorTest.class
})
public class JUnitSuite {
}
