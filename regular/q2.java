//Write a Java program to validate a phone number.
//checking 10 digit numeric or not
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter phone number");
        String pnum=sc.nextLine();
        // Use a regex for Indian phone number validation
        if(pnum.matches("\\d{10}$")){
            System.out.println("indian number");

        }else{
            System.out.println("not indian number");
        }

    }
    
}
