package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public interface P7_Search {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of arraylist =");
        size=sc.nextInt();


        ArrayList<Integer> arr=new ArrayList<>(size);

        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }
        //taking element which we want to search from  user 
        System.out.println(arr);
        System.out.println("enter element you want to search");
        int ele=sc.nextInt();
        //contains method will tell wheiter element is present or not in arraylist
        //indexof(element) will print index at which element is present
        if(arr.contains(ele)){
            System.out.println("element is present in list at index "+arr.indexOf(ele));
        }
        else{
            System.out.println("element is not present in list");
        }
        
    }
}
