package Treemap;


import java.util.TreeMap;
//Write a Java program to associate the specified value with the specified key in a TreeMap.
class P1{
    public static void main(String[] args) {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(1,"one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm);



    }}