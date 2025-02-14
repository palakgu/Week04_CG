package interthreadcommunication;

import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream posi;

    public WriterThread(PipedOutputStream pos) {
        this.posi = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            posi.write(message.getBytes());
            posi.close();
        } catch (IOException e) {
            System.err.println("WriterThread error: " + e.getMessage());
        }
    }
}
