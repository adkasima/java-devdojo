package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionStructures02 {
    public static void main(String[] args) {
        //Print all the pair numbers from 0 to 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
