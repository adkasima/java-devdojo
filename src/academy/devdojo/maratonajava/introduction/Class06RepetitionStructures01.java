package academy.devdojo.maratonajava.introduction;

public class Class06RepetitionStructures01 {
    public static void main(String[] args) {
        //while, do while and for
        int count = 0;
        while (count < 10) {
            System.out.println("count " +count);
            count++;
        }
        count = 12;
        do {
            System.out.println("count " + ++count);
        }while (count < 10);

        for (int i = 0; i <=10; i++) {
            System.out.println("i " +i);
        }
    }
}
