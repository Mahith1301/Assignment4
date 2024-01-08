package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. 
public class P10_remove {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of Linkedlist =");
        size=sc.nextInt();


        LinkedList<Integer> arr=new LinkedList<>();

        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }
        System.out.println(arr);


        //we used getfirst and getlast to print elements
        System.out.println("first and last ocurance are "+ arr.getFirst()+"  "+ arr.getLast());
}
}
