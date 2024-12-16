package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Tomato tomato = new Tomato("Brazilian", 20);
        tomato.setExpirationDate("10/11/2024");
    }
}
