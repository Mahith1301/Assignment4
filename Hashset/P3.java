package Hashset;

import java.util.HashSet;
import java.util.Scanner;
//3. Write a Java program to get the number of elements in a hash set. 
public class P3 {
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
        
        int count=0;
        for(String x:hset){
            count+=1;
        }
        System.out.println("number of elements ="+count);
        //we can use iterate or use size method to find size
        System.out.println("number of elements ="+hset.size());
        
    }
}
