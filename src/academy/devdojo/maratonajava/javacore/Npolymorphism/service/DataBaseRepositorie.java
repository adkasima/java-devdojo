package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repositorie.Repositorie;

public class DataBaseRepositorie implements Repositorie {
    @Override
    public void save() {
        System.out.println("Saving in data base");
    }
}
