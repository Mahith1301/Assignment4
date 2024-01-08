
import java.util.function.Predicate; 

public class q2 {
    public static void main(String[] args) {
    String str="lambda";
        Predicate <String> isEmpty=(str1)-> str1.isEmpty();

        if(isEmpty.test(str)){
            System.out.println("string is empty");

        }else{
            System.out.println("string is not empty");
        }

    }
}
