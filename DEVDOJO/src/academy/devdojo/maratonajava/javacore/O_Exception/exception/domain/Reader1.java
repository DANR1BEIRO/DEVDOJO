package academy.devdojo.maratonajava.javacore.O_Exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing reader 1");
    }
}
