package priorityqueue;

import java.util.Scanner;
import java.util.PriorityQueue;
// Write a Java program to insert a given element into a priority queue.
public class P1 {
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
        System.out.println(tset);
        System.out.println("enter element you want to add");

        tset.add(sc.next());
        System.out.println(tset);

    }
    }
