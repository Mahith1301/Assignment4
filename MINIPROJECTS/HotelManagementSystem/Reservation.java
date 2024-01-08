package HotelManagementSystem;
import java.util.List;
import java.util.ArrayList;
import HotelManagementSystem.*;
interface Reservation {

    void bookRoom(Room room, Guest guest);

    void checkAvailability(int room);

    void printBill(Room room);
}

class BusinessLogic {
    private List<Room> rooms;

    public BusinessLogic() {
        rooms = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        for (int i = 101; i <= 110; i++) {
            rooms.add(new StandardRoom(i));
        }

        for (int i = 201; i <= 210; i++) {
            rooms.add(new DeluxeRoom(i));
        }
    }

    public void checkAvailability(int roomNumber) {
        Room room = findRoom(roomNumber);
        if (room != null) {
            if (!room.isBooked()) {
                System.out.println("Room " + room.getRoomNumber() + " is available for booking.");
            } else {
                System.out.println("Room " + room.getRoomNumber() + " is already booked.");
            }
        } else {
            System.out.println("Room not found.");
        }
    }

    public void bookRoom(int roomNumber, Guest guest) {
        Room room = findRoom(roomNumber);
        if (room != null) {
            if (!room.isBooked()) {
                room.bookRoom();
                System.out.println("Room " + room.getRoomNumber() + " booked for " + guest.getName());
            } else {
                System.out.println("Room " + room.getRoomNumber() + " is already booked.");
            }
        } else {
            System.out.println("Room not found.");
        }
    }

    public void printBill(int roomNumber) {
        Room room = findRoom(roomNumber);
        if (room != null) {
            System.out.println("Bill for Room " + room.getRoomNumber() + " is " + room.calculateBill());
        } else {
            System.out.println("Room not found.");
        }
    }

    private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}