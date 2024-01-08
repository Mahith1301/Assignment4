//1. Write a Java program to implement a lambda expression to find the sum of two integers

interface lam{
    public void add(int a,int b);
}

public class q1{
    public static void main(String[] args) {
        lam l=(a,b)->{System.out.println("sum of two number is "+(a+b));};
        l.add(2,3);
    }
}