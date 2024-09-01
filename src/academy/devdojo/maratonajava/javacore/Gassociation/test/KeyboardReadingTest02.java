package academy.devdojo.maratonajava.javacore.Gassociation.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("I will predict your future!!!");
        System.out.println("Type any question to me, i will answer with yes or no ");

        String question = input.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("NOO!");
        }
    }
}
