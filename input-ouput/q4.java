
// Write a Java program to check if a file or directory has read and write permissions.

import java.io.File;

public class q4 {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\arrayList\\P1_StringPrint.java");
         if (my_file_dir.canWrite()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
          }
         if (my_file_dir.canRead()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
          }  
    }
}
