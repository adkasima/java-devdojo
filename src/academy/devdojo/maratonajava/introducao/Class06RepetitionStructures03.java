package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionStructures03 {
    public static void main(String[] args) {
        //Print the first 25 numbers of a determined value, like 50
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
