//•	 Write a Java program to create a method that reads a file and throws an exception if the file is not found.

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class q2 {
    public static void main(String[] args) {
    try {
      readFile("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\input-ouput\\q1.java");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}