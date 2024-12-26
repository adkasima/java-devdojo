package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.runtime.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }

    }

    public static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String DBusername = "zenitsu";
        String DBpassword = "nezuko321";

        System.out.println("User: ");
        String typedUsername = input.nextLine();
        System.out.println("Password: ");
        String typedPassword = input.nextLine();

        if (!DBusername.equals(typedUsername) || !DBpassword.equals(typedPassword)) {
            throw new InvalidLoginException("Invalid user or password");
        }

        System.out.println("User logged with sucess!");
    }
}
