import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MethodCalc {



    public static double calc(double num1, double num2, String operation) {

        double res = 0;
        switch (operation) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        BigDecimal bd = new BigDecimal(res);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        res = bd.doubleValue();
        return res;
    }


}

