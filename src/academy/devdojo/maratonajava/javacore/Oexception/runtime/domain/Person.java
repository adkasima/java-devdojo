package academy.devdojo.maratonajava.javacore.Oexception.runtime.domain;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving person...");
    }
}
