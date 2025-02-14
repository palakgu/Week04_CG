package interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream posi = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(posi);

            Thread writer = new WriterThread(posi);
            Thread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}