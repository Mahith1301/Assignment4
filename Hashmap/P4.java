package Hashmap;
import java.util.*;
//4. Write a Java program to remove all mappings from a map.
class P4{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println("before removing");
        System.out.println(hm);
        //clear method will clear hashmap
        hm.clear();
        System.out.println("after removing "+hm);



    }}