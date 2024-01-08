import java.io.File;
import java.io.FilenameFilter;
//Write a Java program to get specific files with extensions from a specified folder.
public class q2 {
    public static void main(String[] args) {
        File file = new File("C:\\\\Users\\\\dere275333\\\\OneDrive - Elektrobit\\\\Desktop\\\\java training\\\\Assignment_4\\\\arrayList");
           String[] list = file.list(new FilenameFilter() {
           @Override
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".java")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
