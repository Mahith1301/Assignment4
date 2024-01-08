package priorityqueue;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.List;
//3. Write a Java program to add all the elements of a specified tree set to another tree set.
public class P3 {
        public static void main(String[] args) {
        PriorityQueue<String> tset1=new PriorityQueue<>(List.of("1","2","3"));
        PriorityQueue<String> tset2=new PriorityQueue<>(List.of("1","2","3"));
            System.out.println("first prioity queue"+tset1);
            System.out.println("second priority queue"+tset2);
        tset1.addAll(tset2);

        //tset2 elements are added into tset1
        System.out.println("after adding queue 2 to queue 1");
        System.out.println("first prioity queue"+tset1);
        System.out.println("second prioity queue"+tset2);


    }
}
