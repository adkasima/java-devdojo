package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.test;

import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divTwoNumbers(10, 0);
        System.out.println(result);
    }
}
