package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repositorie.Repositorie;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.DataBaseRepositorie;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.FileRepositorie;

public class RepositorieTest01 {
    public static void main(String[] args) {
        Repositorie repositorie = new FileRepositorie(); //DataBaseRepositorie() // MemoryRepositorie()
        repositorie.save();
    }
}
