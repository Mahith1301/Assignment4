package priorityqueue;

import java.util.Scanner;
import java.util.PriorityQueue;

public class P2 {
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
        System.out.println("elements are");
        //used for each loop
        for(String x:tset){
            System.out.println(x);
        }


    }
    }
