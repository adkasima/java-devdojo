package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.runtime.domain.Reader01;
import academy.devdojo.maratonajava.javacore.Oexception.runtime.domain.Reader02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFileNew();
    }

    public static void readFileNew() {
        try (Reader01 reader01 = new Reader01();
             Reader02 reader02 = new Reader02()) {

        } catch (IOException e) {

        }
    }

    public static void readFileOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file/test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
