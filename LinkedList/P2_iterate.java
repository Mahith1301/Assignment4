package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
//2. Write a Java program to iterate through all elements in a linked list. 
public class P2_iterate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of linkedlist =");
        size=sc.nextInt();


        LinkedList<Integer> arr=new LinkedList<>();
        //we used indexbased for loop iteration
        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }


        System.out.println(arr);

    }
}
