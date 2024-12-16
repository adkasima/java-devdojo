package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.TaxesCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("i9 CoffeLake Turbo", 12000);
        Tomato tomato = new Tomato("Sliced tomato", 6);
        Television tv = new Television("Samsung 4K 50\"", 5000);
        TaxesCalculator.calcTaxes(computer);
        System.out.println("-----<>-----");
        TaxesCalculator.calcTaxes(tomato);
        System.out.println("-----<>-----");
        TaxesCalculator.calcTaxes(tv);
    }
}
