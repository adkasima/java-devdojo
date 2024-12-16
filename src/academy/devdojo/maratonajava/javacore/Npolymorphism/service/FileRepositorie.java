package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repositorie.Repositorie;

public class FileRepositorie implements Repositorie {
    @Override
    public void save() {
        System.out.println("Saving in file");
    }
}
