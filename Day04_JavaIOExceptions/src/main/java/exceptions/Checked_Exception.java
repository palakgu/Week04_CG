package exceptions;

import java.io.*;

public class Checked_Exception {
    public static void main(String[] args) {
        String filepath = "question of capgemini.txt";
        try{
            System.out.println(readFileContent(filepath));
        } catch(IOException e){
            System.out.println(" FIle not found");
        }
    }
    public static String readFileContent(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line ;
            while((line = br.readLine())!= null){
                content.append(line).append("\n");
            }
        } catch(FileNotFoundException e) {
                 throw e;
        } catch (IOException e){
            System.out.println("an error occured while reading the file");
        }
                return content.toString().trim();
    }
}
