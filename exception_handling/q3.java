//•	 Write a Java program that reads a file and throws an exception if the file is empty.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
 try {
      checkFileNotEmpty("C:\\\\Users\\\\dere275333\\\\OneDrive - Elektrobit\\\\Desktop\\\\java training\\\\Assignment_4\\\\input-ouput\\\\q1.java");
      System.out.println("File is not empty.");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (EmptyFileException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkFileNotEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    if (!scanner.hasNextLine()) {
      scanner.close();
      throw new EmptyFileException("File is empty.");
    }

    scanner.close();
  }
}

class EmptyFileException extends Exception {
  public EmptyFileException(String message) {
    super(message);
  }
}