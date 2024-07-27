package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalsStructures04 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTax = 9.7 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double taxValue;

        if (annualSalary <= 34712) {
            taxValue = annualSalary * firstTax;
        } else if (annualSalary  > 34712 && annualSalary <= 68507 ) {
            taxValue = annualSalary * secondTax;
        } else {
            taxValue = annualSalary * thirdTax;
        }

        System.out.println("taxValue: " +taxValue);

    }
}
