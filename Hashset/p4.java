package Hashset;

import java.util.HashSet;
import java.util.Scanner;
//4. Write a Java program to empty an hash set. 

public class p4 {
            public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        //use .add to add element
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of hashset =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            hset.add(sc.next());
        }
        System.out.println(hset);
        //use remove all to remove all element from hset
        hset.removeAll(hset);
        System.out.println("after removing everyting "+hset);
}}
