package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));

        System.out.println("The program finished sucessfully");
    }

    private static int division(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("The params can't be zero");
        }

        return a / b;

    }

}
