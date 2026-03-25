/**
 * UseCase2RoomInitialization
 *
 * Demonstrates basic room types using abstraction, inheritance,
 * and static availability representation.
 *
 * @author D CHARAN SAI REDDY
 * @version 2.1
 */

// Abstract class
abstract class Room {
    protected String roomType;
    protected int beds;
    protected double price;

    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Price     : ₹" + price);
    }
}

// Single Room
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

// Double Room
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

// Suite Room
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}

// Main class
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      Book My Stay App v2.1");
        System.out.println("=====================================");

        // Create room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        System.out.println("\n--- Room Details & Availability ---\n");

        single.displayDetails();
        System.out.println("Available : " + singleAvailable);
        System.out.println("-------------------------------------");

        doubleRoom.displayDetails();
        System.out.println("Available : " + doubleAvailable);
        System.out.println("-------------------------------------");

        suite.displayDetails();
        System.out.println("Available : " + suiteAvailable);
        System.out.println("-------------------------------------");

        System.out.println("\nApplication terminated.");
    }
}
