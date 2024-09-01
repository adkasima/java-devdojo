package academy.devdojo.maratonajava.javacore.Gassociation.test;

import java.util.Scanner;

public class KeyboardReadingTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();

        System.out.println("Type your age: ");
        String age = input.nextLine();

        System.out.println("Type your sex (M or F): ");
        char sex = input.next().charAt(0);

        System.out.println("----------");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Sex " + sex);


    }
}
