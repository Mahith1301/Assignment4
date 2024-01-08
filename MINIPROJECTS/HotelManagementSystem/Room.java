package HotelManagementSystem;
import HotelManagementSystem.*;
public abstract class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }
    
    public int getRoomNumber() {
            return roomNumber;
        }
    
    public boolean isBooked() {
            return isBooked;
        }
    
    public void bookRoom() {
            isBooked = true;
        }
    
        public abstract double calculateBill();

}
//concrete class for standard room
class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculateBill() {
        return 100.0; // Standard room rate
    }
}

// Concrete class for Deluxe Room
class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculateBill() {
        return 150.0; // Deluxe room rate
    }
}