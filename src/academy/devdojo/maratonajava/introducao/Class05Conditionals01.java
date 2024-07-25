package academy.devdojo.maratonajava.introducao;

public class Class05Conditionals01 {
    public static void main(String[] args) {
        int age = 18;
        boolean isAuthorizedToBuyAlcohol = age >= 18;

        if (isAuthorizedToBuyAlcohol) {
            System.out.println("You can buy alcohol");
        } else {
            System.out.println("You can't buy alcohol");
        }

    }
}
