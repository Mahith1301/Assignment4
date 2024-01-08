package Treemap;


import java.util.TreeMap;
// Write a Java program to count the number of key-value (size) mappings in a map.
class P2{
   
        public static void main(String[] args) {
            TreeMap<Integer,String> hm1=new TreeMap<Integer,String>();
            hm1.put(1,"one");
            hm1.put(2, "two");
            hm1.put(3, "three");
            
            TreeMap<Integer,String> hm2=new TreeMap<Integer,String>();
            hm2.put(4,"four");
            hm2.put(5, "five");
            hm2.put(6, "six");
    
            //using put all method
                    System.out.println("before adding");
            System.out.println(hm1);
            System.out.println(hm2);
            hm1.putAll(hm2);
    
    
    
            System.out.println("after adding");
            System.out.println(hm1);
            System.out.println(hm2);

    }}