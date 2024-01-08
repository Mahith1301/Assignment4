//1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
public class q1 extends Thread{
    public void run(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        q1 thread=new q1();
        thread.start();
    }
}   
