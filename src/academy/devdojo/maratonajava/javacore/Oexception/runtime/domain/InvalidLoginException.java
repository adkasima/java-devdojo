package academy.devdojo.maratonajava.javacore.Oexception.runtime.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Invalid login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
