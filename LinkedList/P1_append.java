package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
//1. Write a Java program to append the specified element to the end of a linked list. 
public class P1_append {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

        LinkedList<Integer> linklist=new LinkedList<>();
        //add to add element to linked list
        linklist.add(10);
        linklist.add(20);

        System.out.println(linklist);
        //taking element to add at last from user addlast method is used 
        System.out.println("enter element you want to add at end");
        int ele=sc.nextInt();
        linklist.addLast(ele);

        System.out.println("after adding lindlist is "+ linklist);
        
    }
    
}