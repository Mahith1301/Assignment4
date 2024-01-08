package HotelManagementSystem;

import HotelManagementSystem.*;

import java.util.Scanner;

public class Main{
  public static void main  (String args[]){
    BusinessLogic businessLogic = new BusinessLogic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Room numbers from 101 to 110 standard room");
        System.out.println("Room numbers from 201 to 210 deluxe room");

        while (true) {
            System.out.println("\nHotel Management System Menu:");
            System.out.println("1. Check Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Print Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    businessLogic.checkAvailability(roomNumber);
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomToBook = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    System.out.print("Enter guest contact number: ");
                    String contactNumber = scanner.nextLine();
                    Guest guest = new Guest(guestName, contactNumber);
                    businessLogic.bookRoom(roomToBook, guest);
                    break;
                case 3:
                    System.out.print("Enter room number to print bill: ");
                    int roomToPrintBill = scanner.nextInt();
                    businessLogic.printBill(roomToPrintBill);
                    break;
                case 4:
                    System.out.println(" Thank you! for choosing our hotel");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}