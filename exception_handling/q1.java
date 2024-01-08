//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
public class q1{
    public static void main(String[] args) {
                
                try {
                    int number = 7; 
                    checkEvenNumber(number);
                    System.out.println("Number is even.");
                } catch (OddNumberException e) {
                    System.out.println("Exception caught: " + e);
                }
            }
        
            private static void checkEvenNumber(int number) throws OddNumberException {
                // Check if the number is odd
                if (number % 2 != 0) {
                    throw new OddNumberException();
                }
    }

}
class OddNumberException extends Exception {

}