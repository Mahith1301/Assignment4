//Write a Java program to check if the given pathname is a directory or a file

import java.io.File;

public class q5 {
    public static void main(String[] args) {
        File my_file_dir = new File("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\arrayList");
         if (my_file_dir.isDirectory()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
          }
         File my_file_dir1 = new File("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\arrayList\\P1_StringPrint.java");
          if (my_file_dir1.isFile()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
          } 
    }
}
