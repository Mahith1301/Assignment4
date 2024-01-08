package Hashmap;
import java.util.*;
//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
class P5{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3, "three");
        
        System.out.println("is hashmap empty "+hm.isEmpty());
        hm.clear();
        System.out.println("after using clear "+hm.isEmpty());

   
    }}