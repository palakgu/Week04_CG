package exceptions;

import java.util.*;

public class CustomExceptionExample {

    public static void validateAge(int age) throws InvalidAgeExceptions {
        if (age < 18) {
            throw new InvalidAgeExceptions("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeExceptions e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        }
    }
}
