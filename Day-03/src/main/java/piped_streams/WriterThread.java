package piped_streams;
import java.io.*;

public class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
            String[] messages = { "Hello", "This is a PipedStream", "End of Message" };
            for (String msg : messages) {
                writer.write(msg);
                writer.newLine();
                writer.flush();
                System.out.println("Writer: " + msg);
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}
