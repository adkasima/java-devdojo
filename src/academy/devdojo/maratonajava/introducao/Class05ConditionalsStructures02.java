package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalsStructures02 {
    public static void main(String[] args) {
        // age < 15 child category
        // age >= && age < 18 young category
        // age > 18 adult category
        int age = 18;

        if (age < 15) {
            System.out.println("Child category");
        } else if (age >= 15 && age < 18) {
            System.out.println("Young category");
        } else {
            System.out.println("Adult category");

        }
    }
}
