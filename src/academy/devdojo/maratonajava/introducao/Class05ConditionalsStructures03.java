package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalsStructures03 {
    public static void main(String[] args) {
        double salary = 40D;
        String donateMessage = "I will donate 500$ to DevDojo";
        String cantDonateMessage = "I can't donate now, but i will";
        String result = salary >= 500 ? donateMessage:cantDonateMessage;

        System.out.println(result);
    }
}
