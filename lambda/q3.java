import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {
    public static void main(String[] args) {
                List<String> stringList = Arrays.asList("APPLE", "banana", "OranGE", "grape");
        System.out.println("given list is "+stringList);
        // Lambda expression to convert a string to uppercase
        
        List<String> uppercasedList = stringList.stream()
                .map(String::toUpperCase) // Method reference can be used here
                .collect(Collectors.toList());
        System.out.println("Uppercase List: " + uppercasedList);

        // Lambda expression to convert a string to lowercase
        List<String> lowercasedList = stringList.stream()
                .map(String::toLowerCase) // Method reference can be used here
                .collect(Collectors.toList());
        System.out.println("Lowercase List: " + lowercasedList);

      
    }
}
