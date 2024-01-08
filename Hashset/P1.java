package Hashset;
import java.util.HashSet;
import java.util.Scanner;
//1. Write a Java program to append the specified element to the end of a hash set. 
public class P1 {
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        //use .add to add elment to hashset

        hset.add("red");
        hset.add("blue");
        hset.add("green");

        System.out.println("hash set is "+hset);
    }
    
}
