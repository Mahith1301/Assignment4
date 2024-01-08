import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class q4 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Lambda expression to filter out even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbersList = filterNumbers(numberList, isEven);
        System.out.println("Even Numbers List: " + evenNumbersList);

        // Lambda expression to filter out odd numbers
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        List<Integer> oddNumbersList = filterNumbers(numberList, isOdd);
        System.out.println("Odd Numbers List: " + oddNumbersList);
    }

    private static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream()
                .filter(predicate)
                .toList();
    }
}
