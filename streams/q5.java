
//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.Arrays;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        List < String > colors = Arrays.asList("Black", "Green", "Blue", "Pink", "Brown");
    System.out.println("Original list of strings (colors): " + colors);
    char startingLetter = 'B';
    // Count strings starting with a specific letter
    long ctr = colors.stream()
      .filter(s -> s.startsWith(String.valueOf(startingLetter)))
      .count();
    System.out.println("\nNumber of colors starting with '" + startingLetter + "': " + ctr);


    }
}
