package TreeSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.List;
//3. Write a Java program to add all the elements of a specified tree set to another tree set.
public class P3 {
        public static void main(String[] args) {
        TreeSet<String> tset1=new TreeSet<>(List.of("1","2","3"));
        TreeSet<String> tset2=new TreeSet<>(List.of("4","5","6"));

        tset1.addAll(tset2);
        //tset2 elements are added into tset1
        System.out.println("tset1 ="+tset1);
        System.out.println("tset2 "+tset2);


    }
}
