//•	Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a list of integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\s+");
            
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }

            checkForDuplicates(numbers);

            System.out.println("No duplicates found.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void checkForDuplicates(int[] numbers) throws Exception {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                throw new Exception("Duplicate number found: " + number);
            }
        }
    }
}
