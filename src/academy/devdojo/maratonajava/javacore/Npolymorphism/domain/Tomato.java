package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Tomato extends Product{
    public static final double TAXES_PER_CENT = 0.06;
    private String expirationDate;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcTaxes() {
        System.out.println("Calculating tomato taxes");
        return this.value * TAXES_PER_CENT;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
