package TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
//Write a Java program to get the first and last elements in a tree set.
public class P5 {
        public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        //use .add
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of treeset =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            tset.add(sc.next());
        }
        System.out.println("tset is "+tset);
        //list will be sorted and printed maximum and minimum values
        System.out.println("first is "+tset.first());
        System.out.println("last is "+tset.last());

    }
}
