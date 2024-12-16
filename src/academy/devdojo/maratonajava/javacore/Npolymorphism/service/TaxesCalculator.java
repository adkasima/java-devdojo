package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class TaxesCalculator {
    public static void calcTaxes(Product product) {
        System.out.println("Product taxe report");
        double taxe = product.calcTaxes();
        System.out.println("Product " +product.getName());
        System.out.println("Preço " +product.getValue());
        System.out.println("Taxe to pay " +taxe);

    }
}
