package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Owner OWNER = new Owner();

    //Métodos finais na superclasse não podem ser sobrescritos
    public final void print() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
