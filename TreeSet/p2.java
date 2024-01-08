package TreeSet;
import java.util.TreeSet;
import java.util.Scanner;
//2. Write a Java program to iterate through all elements in a tree set
public class p2 {
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
        System.out.println("elements are ");
        //using for each
        for(String x:tset){
            System.out.println(x);
        }
    }
}
