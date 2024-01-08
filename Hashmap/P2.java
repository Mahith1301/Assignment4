package Hashmap;
import java.util.*;

//2.Write a Java program to count the number of key-value (size) mappings in a map
class P2{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3, "three");
        //size method will tell  how many key value pairs are present in hash map
        System.out.println("size of hashmap is "+hm.size());



    }}