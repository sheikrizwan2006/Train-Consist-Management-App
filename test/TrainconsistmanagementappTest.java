import java.util.*;
import java.util.stream.*;

public class TrainconsistmanagementappTest {

    static List<Bogie> getFiltered(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        System.out.println("Test 1: Capacity > 70");
        List<Bogie> result1 = getFiltered(bogies, 70);
        for (Bogie b : result1) {
            System.out.println(b.name);
        }

        System.out.println("\nTest 2: Capacity = 70 (should exclude)");
        List<Bogie> result2 = getFiltered(bogies, 70);
        for (Bogie b : result2) {
            System.out.println(b.name);
        }

        System.out.println("\nTest 3: Capacity < 30");
        List<Bogie> result3 = getFiltered(bogies, 30);
        for (Bogie b : result3) {
            System.out.println(b.name);
        }

        System.out.println("\nTest 4: No Matching");
        List<Bogie> result4 = getFiltered(bogies, 100);
        System.out.println("Size: " + result4.size());

        System.out.println("\nTest 5: All Matching");
        List<Bogie> result5 = getFiltered(bogies, 10);
        for (Bogie b : result5) {
            System.out.println(b.name);
        }

        System.out.println("\nTest 6: Empty List");
        List<Bogie> empty = new ArrayList<>();
        List<Bogie> result6 = getFiltered(empty, 50);
        System.out.println("Size: " + result6.size());

        System.out.println("\nTest 7: Original List Unchanged");
        System.out.println("Original Size: " + bogies.size());
        getFiltered(bogies, 60);
        System.out.println("After Filter Size: " + bogies.size());
    }
}