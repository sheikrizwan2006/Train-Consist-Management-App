import java.util.*;

public class TrainconsistmanagementappTest {

    public static void main(String[] args) {

        System.out.println("Test 1: Valid Capacity");
        try {
            Bogie b = new Bogie("Sleeper", 50);
            System.out.println("Created Successfully");
        } catch (Exception e) {
            System.out.println("Failed");
        }

        System.out.println("\nTest 2: Negative Capacity");
        try {
            Bogie b = new Bogie("AC Chair", -10);
            System.out.println("Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest 3: Zero Capacity");
        try {
            Bogie b = new Bogie("First Class", 0);
            System.out.println("Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest 4: Exception Message");
        try {
            new Bogie("Sleeper", -5);
        } catch (Exception e) {
            System.out.println(e.getMessage().equals("Capacity must be greater than zero"));
        }

        System.out.println("\nTest 5: Object Integrity");
        try {
            Bogie b = new Bogie("AC Chair", 60);
            System.out.println(b.name + " " + b.capacity);
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("\nTest 6: Multiple Valid Bogies");
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", 56);
            System.out.println("Both Created");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}