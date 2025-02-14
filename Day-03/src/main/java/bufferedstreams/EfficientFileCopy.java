package bufferedstreams;

import java.io.*;

public class EfficientFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "src/main/java/sourceFile";
        String destBuffered = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-03\\src\\main\\java\\bufferedstreams\\destinationBuffered";
        String destUnbuffered = "C:\\Users\\Vivek Patel\\OneDrive\\Desktop\\Week-04\\Day-03\\src\\main\\java\\bufferedstreams\\destinationUnBuffered";

        long startTime = System.nanoTime();
        copyUsingBufferedStreams(sourceFile, destBuffered);
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        copyUsingUnbufferedStreams(sourceFile, destUnbuffered);
        endTime = System.nanoTime();
        System.out.println("Unbuffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }


    public static void copyUsingBufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered copy completed.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void copyUsingUnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Unbuffered copy completed.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}