package Hashset;
import java.util.Scanner;
import java.util.HashSet;
//Write a Java program to test if a hash set is empty or not. 
public class P5 {
            public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of hashset =");
        size=sc.nextInt();
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            hset.add(sc.next());
        }
        System.out.println(hset);
        //using isEmpty method to find wheither hashset is empty or not
        if(hset.isEmpty()){
            System.out.println("hset is empty");
        }
        else{
            System.out.println("hset is not empty");
        }
        
}}