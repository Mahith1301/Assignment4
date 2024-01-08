package priorityqueue;

import java.util.Scanner;
import java.util.PriorityQueue;
//5. Write a Java program to remove all elements from a priority queue. 
public class P5 {
    public static void main(String[] args) {
         PriorityQueue<String> tset=new PriorityQueue<>();
        //use .add
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter number of element =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            tset.add(sc.next());
        }
        
        //using remove all
        System.out.println(tset);
        tset.removeAll(tset);

        System.out.println("after adding "+tset);

    }
    }
