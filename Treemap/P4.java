package Treemap;

import java.util.TreeMap;
import java.util.Scanner;
//4.  Write a Java program to search for a value in a Tree Map.
public class P4 {
    public static void main(String[] args) {
        TreeMap<Integer,String> hm1=new TreeMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        System.out.println("treemap is "+hm1);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value to be searched");
        String key=sc.next();
        //using contain value
        if(hm1.containsValue(key)){
            System.out.println("value is present in treeset");
        }else{
            System.out.println("value not present");
        }
        
}}
