import java.util.*;
import java.util.stream.*;

public class TrainconsistmanagementappTest {

    static int calculateTotal(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Test 1: Total Seat Calculation");
        System.out.println(calculateTotal(bogies));

        System.out.println("\nTest 2: Multiple Bogies");
        System.out.println(calculateTotal(bogies));

        System.out.println("\nTest 3: Single Bogie");
        List<Bogie> single = new ArrayList<>();
        single.add(new Bogie("Sleeper", 50));
        System.out.println(calculateTotal(single));

        System.out.println("\nTest 4: Empty List");
        List<Bogie> empty = new ArrayList<>();
        System.out.println(calculateTotal(empty));

        System.out.println("\nTest 5: Capacity Extraction Check");
        System.out.println(calculateTotal(bogies));

        System.out.println("\nTest 6: All Bogies Included");
        bogies.add(new Bogie("Luxury", 80));
        System.out.println(calculateTotal(bogies));

        System.out.println("\nTest 7: Original List Unchanged");
        System.out.println("Before: " + bogies.size());
        calculateTotal(bogies);
        System.out.println("After: " + bogies.size());
    }
}