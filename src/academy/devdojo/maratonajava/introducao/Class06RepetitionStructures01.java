package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionStructures01 {
    public static void main(String[] args) {
        //while, do while and for
        int count = 0;
        while (count < 10) {
            System.out.println("count " +count);
            count++;
        }

        do {
            System.out.println("count " + ++count);
        }while (count < 10);
    }
}
