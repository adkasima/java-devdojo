package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.test;

import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        System.out.println("Finishing CalculatorTest01");
        calculator.subTwoNumbers();
    }
}
