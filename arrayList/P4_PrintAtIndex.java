package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
//4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
public class P4_PrintAtIndex {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of arraylist =");
        size=sc.nextInt();


        ArrayList<Integer> arr=new ArrayList<>(size);
        //taking input index from user
        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }

        System.out.println(arr);
        System.out.println("index =");
        int ind=sc.nextInt();
        System.out.println("element at index "+ind+" is "+(arr.get(ind)));

        
    }
}
