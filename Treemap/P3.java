package Treemap;

import java.util.TreeMap;
import java.util.Scanner;
//3. Write a Java program to search for a key in a Tree Map.
public class P3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> hm1=new TreeMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        System.out.println("treemap is "+hm1);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter element to be searched");
        int key=sc.nextInt();
        //using contains key
        if(hm1.containsKey(key)){
            System.out.println("key is present in treeset");
        }else{
            System.out.println("key not present");
        }
        
}}
