package piped_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader received: " + line);
            }
        } catch (IOException e) {
            System.out.println("Reader error: " + e.getMessage());
        }
    }

}
