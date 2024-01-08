package TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
//4. Write a Java program to create a reverse order view of the elements contained in each tree set. 
public class p4 {
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
        System.out.println("treeset is "+tset);
        //using iterator and decending iteraor
        Iterator it=tset.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
