package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
//3. Write a Java program to insert an element into the array list at the first position. 
public class P3_InsertFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of arraylist =");
        size=sc.nextInt();


        ArrayList<Integer> arr=new ArrayList<>(size);

        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }

        System.out.println(arr);
        System.out.println("enter element to add at first");
        int ele=sc.nextInt();
        arr.add(0,ele);

        System.out.println("arraylist after inserting element at first"+arr);
    }
}
