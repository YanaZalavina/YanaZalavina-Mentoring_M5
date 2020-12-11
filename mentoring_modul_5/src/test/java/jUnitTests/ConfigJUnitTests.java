package jUnitTests;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class ConfigJUnitTests {
    protected Calculator calculator;
    @Before
    public void beforeClass() {
        calculator = new Calculator();
    }

    @After
    public void afterClass() {
        calculator = null;
    }
}
