package pro.sky.alex.calculatorspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import pro.sky.alex.calculatorspringboot.Service.CalculatorServiceImpl;

public class CalculatorServiceImplTest {

    CalculatorServiceImpl calculator = new CalculatorServiceImpl();
    @Test
    public void plus() {
        Assertions.assertSame(4,calculator.plus(2,2));

    }


    @Test()
    public void minus() {
        Assertions.assertSame(3,calculator.minus(5,2));
    }


    @Test
    public void multiply() {
        Assertions.assertSame(4,calculator.multiply(2,2));
    }


    @Test
    public void divide() {
        Assertions.assertSame(2,calculator.divide(4,2));
    }


    @Test
    public void divideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

}
