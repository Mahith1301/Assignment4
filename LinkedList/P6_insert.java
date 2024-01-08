package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
//6. Write a Java program to insert elements into the linked list at the first and last positions. 
public class P6_insert {
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
        //we used addfirst and addlast method in linkedlist to insert
        System.out.println("enter element you want to add at first");
        int ele=sc.nextInt();
        arr.addFirst(ele);
        System.out.println("enter element you want to add at last");
        ele=sc.nextInt();
        arr.addLast(ele);

        System.out.println("after addition linked list is "+arr);
}
}