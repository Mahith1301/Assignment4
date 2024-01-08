package Hashmap;
import java.util.*;
//Write a Java program to associate the specified value with the specified key in a HashMap.
class P1{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        //put method will take [key and value from user
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm);



    }}