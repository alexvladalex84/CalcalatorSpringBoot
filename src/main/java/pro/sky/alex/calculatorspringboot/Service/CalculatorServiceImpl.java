package pro.sky.alex.calculatorspringboot.Service;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.alex.calculatorspringboot.Exception.EmptyInputParametersException;
import pro.sky.alex.calculatorspringboot.Exception.InvalidInputParametersException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public static void checkForEmptyParameters(Integer num1, Integer num2) {


        if (num1==null|| num2==null) {
            throw new EmptyInputParametersException("Строки для ввода цыфр не заполнены");
        }
//        if (num1.matches("[a-zA-Z]+") || num2.matches("[a-zA-Z]+")) {
//            throw new InvalidInputParametersException("Необходимо ввести только цифры");
//
//        }

    }


    @Override
    public String greetings() {
        return "Привет,калькулятор на связи!";
    }

    @Override
    public String plus(int num1,int num2) {
//        checkForEmptyParameters(num1, num2);
//        return String.format(num1 + " + " + num2 + " = ") + (num1 + num2);
//        return Integer.parseInt(String.format("%d+%d",num1,num2));

        return String.valueOf(num1 + num2);
    }

    @Override
    public int minus(int num1, int num2) {
//        checkForEmptyParameters(num1, num2);

//        return num1 + " - " + num2 + " = " + (Integer.valueOf(num1) - (Integer.valueOf(num2)));
        return (num1 - num2);
    }


    @Override
    public int multiply(int num1, int num2) {
//        checkForEmptyParameters(num1, num2);
//        return num1 + " * " + num2 + " = " + (Integer.valueOf(num1) * (Integer.valueOf(num2)));
        return (num1 * num2);
    }


    @Override
    public int divide(int num1, int num2) {
//        checkForEmptyParameters(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException(" на ноль делить нельзя !");
        } else {
//            return num1 + "/" + num2 + "=" + (Double.valueOf(num1) / (Double.valueOf(num2)));
            return (int) (Double.valueOf(num1) / (Double.valueOf(num2)));
        }
    }
}
