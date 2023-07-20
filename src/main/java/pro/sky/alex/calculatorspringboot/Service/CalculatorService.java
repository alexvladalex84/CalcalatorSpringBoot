package pro.sky.alex.calculatorspringboot.Service;

public interface CalculatorService {
    String greetings();

    int plus(int num1,int num2);


    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1,int num2);
}/* Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате "5 + 5 = 10".
 Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате "5 − 5 = 0".
 Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате "5 * 5 = 25".
 Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате "5 / 5 = 1".*/
