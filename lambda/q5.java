import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
                List<String> stringList = Arrays.asList("narresh","balaji","aswin","mahith");

        // Lambda expression to sort strings in alphabetical order
        Collections.sort(stringList, (str1, str2) -> str1.compareTo(str2));

        // Print the sorted list
        System.out.println("Sorted List: " + stringList);
    }
}
