
//Write a Java program to check if a file or directory specified by pathname exists or not.

import java.io.File;

public class q3 {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\arrayList\\P1_StringPrint.java");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
    }
}
