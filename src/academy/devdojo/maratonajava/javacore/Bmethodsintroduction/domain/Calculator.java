package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subTwoNumbers() {
        System.out.println(20 - 5);
    }

    public void multiTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

}
