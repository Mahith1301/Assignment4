package Treemap;

import java.util.TreeMap;
//5. Write a Java program to get all keys from a Tree Map.
public class P5 {
public static void main(String[] args) {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3,"three");
        //printing keys
        System.out.println("key set is"+hm.keySet());
     

    }}    

