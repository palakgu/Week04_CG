import java.io.*;
public class BufferedStreams {
    private static final int BUFFER_SIZE = 4096 ;

    public static void main(String[] args) {


        String fileinput = "question of capgemini.txt";
        String fileoutput = "output.txt";
        String unbuffered = "out.txt";

        long startTime = System.nanoTime();
        copyFileUsingBufferedStreams(fileinput, fileoutput);
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1000000 + " ms");

        long startTime1 = System.nanoTime();
        copyFileUsingUnbufferedStreams(fileinput, unbuffered);
        long endTime1 = System.nanoTime();
        System.out.println("Unbuffered Streams Time: " + (endTime1 - startTime1) / 1000000 + " ms");
    }

    private static void copyFileUsingBufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Buffered Streams");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFileUsingUnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Unbuffered Streams");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
