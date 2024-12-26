package academy.devdojo.maratonajava.javacore.Oexception.runtime.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader01 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closing reader 01");
    }
}
