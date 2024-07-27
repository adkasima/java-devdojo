package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionStructures04 {
    public static void main(String[] args) {
        //Given a car value, how many installments it can be paid
        //installments >= 1000

        double totalCarValue = 30000;
        for (int installment = 1; installment <= totalCarValue; installment++) {
            double installmentvalue = totalCarValue / installment;
            if (installmentvalue < 1000) {
                break;
            }
            System.out.println("installment " +installment + " R$ " + installmentvalue);
        }

    }
}
