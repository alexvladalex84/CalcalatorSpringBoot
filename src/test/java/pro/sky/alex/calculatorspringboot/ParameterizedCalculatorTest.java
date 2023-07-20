package pro.sky.alex.calculatorspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sky.alex.calculatorspringboot.Service.CalculatorServiceImpl;

public class ParameterizedCalculatorTest {
    CalculatorServiceImpl calculator = new CalculatorServiceImpl();


    @ParameterizedTest
    @CsvSource({
            "2,2,4",
            "3,2,5",
            "25,15,40"
    })
    public void plus(int v1,int v2,int v3) {
        Assertions.assertSame(v3, calculator.plus(v1, v2));

    }

    @ParameterizedTest
    @CsvSource({
            "4,2,2",
            "3,2,1",
            "25,15,10"
    })
    public void minus(int v1, int v2, int v3) {

        Assertions.assertSame(v3, calculator.minus(v1, v2));

    } @ParameterizedTest
    @CsvSource({
            "4,2,8",
            "3,2,6",
            "22,5,110"
    })
    public void multiply(int v1, int v2, int v3) {

        Assertions.assertSame(v3, calculator.multiply(v1, v2));

    } @ParameterizedTest
    @CsvSource({
            "4,2,2",
            "10,2,5",
            "100,50,2"
    })
    public void divide(int v1, int v2, int v3) {

        Assertions.assertSame(v3, calculator.divide(v1, v2));

    }




}
