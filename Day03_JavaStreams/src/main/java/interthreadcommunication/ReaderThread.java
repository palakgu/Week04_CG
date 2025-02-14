package interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream pist;

    public ReaderThread(PipedInputStream pis) {
        this.pist = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pist.read()) != -1) {
                System.out.print((char) data);
            }
            pist.close();
        } catch (IOException e) {
            System.err.println("ReaderThread error: " + e.getMessage());
        }
    }
}