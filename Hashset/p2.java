package Hashset;

import java.util.HashSet;
import java.util.Scanner;
//2. Write a Java program to iterate through all elements in a hash list. 
public class p2 {
        public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        //use .add
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of hashset =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            hset.add(sc.next());
        }
        System.out.println("elements are ");
        //for each method
        for(String x:hset){
            System.out.println(x);
        }
    }
}
