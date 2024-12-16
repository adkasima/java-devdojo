package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calcTaxes());
        System.out.println("------------");
        Product product2 = new Tomato("Brazilian", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calcTaxes());
    }
}
