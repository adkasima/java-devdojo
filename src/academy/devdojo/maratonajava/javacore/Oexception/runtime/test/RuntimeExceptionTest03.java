package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection2();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening the file");
            System.out.println("Writing data on file");
            return "Connection opened";
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Closing the file");

        }
        return null;
    }

    private static String openConnection2() {
        try {
            System.out.println("Opening the file");
            System.out.println("Writing data on file");
            throw new RuntimeException();
        }finally {
            System.out.println("Closing the file");
        }
    }
}
