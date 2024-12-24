package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("On ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("On RuntimeException");
        }

//        try {
//            maybeThrowException();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        try {
            maybeThrowException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, IOException {

    }
}
