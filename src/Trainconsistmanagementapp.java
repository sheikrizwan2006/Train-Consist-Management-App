import java.util.*;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class Trainconsistmanagementapp {

    public static void main(String[] args) {

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1.name + " - " + b1.capacity);

            Bogie b2 = new Bogie("AC Chair", -10); // invalid
            System.out.println("Created: " + b2.name + " - " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}