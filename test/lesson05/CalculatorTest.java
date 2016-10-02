package lesson05;

import org.junit.*;
import ru.javawebinar.webapp.WebAppException;


import static org.junit.Assert.*;

/**
 * user
 * 27.09.2016
 */
public class CalculatorTest {

    static Calculator calc; // = new Calculator();
    static{
        calc = new Calculator();
        calc.abs(1);

    }


    @Before
    public void setUp() throws Exception {
        // Выполняется перед каждым методом JUnit
        // Удобно использовать для подготовки базы для теста

    }

    @After
    public void tearDown() throws Exception {
        // после каждого теста

    }

    @Test (expected = WebAppException.class)
    public void abs() throws Exception {
        assertEquals(calc.abs(-5),5);
        throw new WebAppException("");
    }

}