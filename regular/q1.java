//Write a Java program to remove all non-alphanumeric characters from a given string.
public class q1 {
    public static void main(String[] args) {
        String inputstr="qwertyuio1234567!@#$";
        String cleanedstr;
        cleanedstr=inputstr.replaceAll("[^a-zA-Z0-9]", "") ;
        System.out.println("before cleaning    "+inputstr);
        System.out.println("after cleaning     "+cleanedstr);

    }
}
