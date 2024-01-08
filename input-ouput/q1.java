
//Write a Java program to get a list of all file/directory names in the given directory.

import java.io.File;
import java.util.Date;

public class q1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dere275333\\OneDrive - Elektrobit\\Desktop\\java training\\Assignment_4\\arrayList");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
    }
}}
