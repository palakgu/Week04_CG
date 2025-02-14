package filestreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputFromConsole {
    public static final String OUTPUT_File = "output.txt";
    public static void main(String[] args) {
        String userData = getUserInput();
        writeUserData(userData);
    }
    public static String getUserInput(){
        StringBuilder userData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your name ");
            String name = reader.readLine();
            System.out.println(" Enter your age ");
            String age = reader.readLine();
            System.out.println(" Enter your city ");
            String city = reader.readLine();
            System.out.println("Enter your favourite programming language");
            String language = reader.readLine();

            userData.append("Name: ").append(name).append("\n")
                    .append("Age: ").append(age).append("\n").
                    append("City: ").append(city).append("\n")
                    .append("Language: ").append(language);
        } catch (IOException e){
            System.err.println("Error reading input: " + e.getMessage());
        }
            return userData.toString();

    }
    public static void writeUserData(String userData){
        try(FileWriter writer = new FileWriter(OUTPUT_File,true )){
            writer.write(userData);
            System.out.println(" User Information saved succesfully in "+ OUTPUT_File);
        } catch (IOException e){
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
