package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
//7. Write a Java program to insert the specified element at the front of a linked list. 
public class P7_insert2 {
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
        //we used addfirst method
        System.out.println("enter element you want to add at first");
        int ele=sc.nextInt();
        arr.addFirst(ele);


        System.out.println("after addition linked list is "+arr);
}}
