package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
//1. Write a Java program to create an array list, add some colors (strings), and print out the collection. 
public class P1_StringPrint{
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of arraylist =");
        size=sc.nextInt();


        ArrayList<String> arr=new ArrayList<>(size);

        for (int i=0;i<size;i++){
            System.out.println("enter colour you want to add at index "+i);
            arr.add(sc.next());    
        }

        for (String x : arr){
            System.out.print(x+" ");
        }
        System.out.println(arr);


    }

}