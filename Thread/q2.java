//2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
class NumberPrinter implements Runnable {
    private final int limit;
    private final boolean isEven;

    public NumberPrinter(int limit, boolean isEven) {
        this.limit = limit;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        for (int i = isEven ? 2 : 1; i <= limit; i += 2) {
            if ((isEven && i % 2 == 0) || (!isEven && i % 2 != 0)) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        int limit = 20;

        // Create two threads for even and odd numbers
        Thread evenThread = new Thread(new NumberPrinter(limit, true), "EvenThread");
        Thread oddThread = new Thread(new NumberPrinter(limit, false), "OddThread");

        // Start both threads
        evenThread.start();
        oddThread.start();

        // Wait for both threads to complete
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}