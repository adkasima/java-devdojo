package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.test;

import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1, 2, 3, 4, 5};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(numbers);
        calculator.sumVarArgs(1,2,3,4,5,6,7,8,9,10);

    }
}
