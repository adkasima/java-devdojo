package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Computer extends Product{
    public static final double TAXES_PER_CENT = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcTaxes() {
        System.out.println("Calculating computer taxes");
        return this.value * TAXES_PER_CENT;
    }
}
