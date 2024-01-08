//4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q4 {
    public static void main(String[] args) {
        List < Integer > nums = Arrays.asList(10,20,30,10,40,50,40);
    System.out.println("Original List of numbers: " + nums);
    // Remove duplicates
    List < Integer > distinctNumbers = nums.stream()
      .distinct()
      .collect(Collectors.toList());
    System.out.println("After removing duplicates  " + distinctNumbers);
    }
}
