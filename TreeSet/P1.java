package TreeSet;
import java.util.TreeSet;
import java.util.Scanner;
//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set. 
public class P1 {
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        //use .add
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter number of element =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            tset.add(sc.next());
        }


        System.out.println("hash set is "+tset);
    }
    
}
