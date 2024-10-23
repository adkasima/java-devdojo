package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Checking permissions");
    };
}
