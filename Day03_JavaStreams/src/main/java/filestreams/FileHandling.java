package filestreams;
import java.io.*;
public class FileHandling {
    public static void main(String args[]) {
        try (FileInputStream fis = new FileInputStream("question of capgemini.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
