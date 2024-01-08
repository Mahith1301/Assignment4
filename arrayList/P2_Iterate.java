package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
//2. Write a Java program to iterate through all elements in an array list. 

public class P2_Iterate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of arraylist =");
        size=sc.nextInt();


        ArrayList<Integer> arr=new ArrayList<>(size);

        for (int i=0;i<size;i++){
            System.out.println("enter Integer you want to add at index "+i);
            arr.add(sc.nextInt());    
        }
            //traversing through list through for each
        for (Integer x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(arr);

    }
}
