package academy.devdojo.maratonajava.javacore.HInheritance.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Adress adress;

    static {
        System.out.println("on person static initialization block");
    }

    {
        System.out.println("on person initialization block 1");
    }

    {
        System.out.println("on person initialization block 2");
    }

    public Person(String name) {
        System.out.println("on person constructor");
        this.name = name;
    }

    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.adress.getStreet() + " " + this.adress.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
