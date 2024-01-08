package Hashmap;
import java.util.*;

//3.Write a Java program to count the number of key-value (size) mappings in a map
class P3{
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        
        HashMap<Integer,String> hm2=new HashMap<Integer,String>();
        hm2.put(4,"four");
        hm2.put(5, "five");
        hm2.put(6, "six");

                System.out.println("before adding");
        System.out.println(hm1);
        System.out.println(hm2);
        hm1.putAll(hm2);

        //copying contents of hm2 to hm1

        System.out.println("after adding");
        System.out.println(hm1);
        System.out.println(hm2);
        


    }}