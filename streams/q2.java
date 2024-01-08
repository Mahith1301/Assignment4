
//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q2 {
    public static void main(String[] args) {
        List < String > colors = Arrays.asList( "grEEn", "white", "ORANGE", "pink");
    System.out.println("List of strings: " + colors);
    // Convert strings to uppercase 
    List < String > uppercaseStrings = colors.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println("\nUppercase Strings: " + uppercaseStrings);

    // Convert strings to lowercase 
    List < String > lowercaseStrings = colors.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());

    System.out.println("Lowercase Strings: " + lowercaseStrings);
    }
}
