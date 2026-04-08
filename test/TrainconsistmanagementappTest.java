import java.util.*;
import java.util.stream.*;

public class TrainconsistmanagementappTest {

    static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Test 1: Group by Type");
        Map<String, List<Bogie>> t1 = groupBogies(bogies);
        System.out.println(t1.keySet());

        System.out.println("\nTest 2: Multiple Bogies Same Group");
        System.out.println("Sleeper count: " + t1.get("Sleeper").size());

        System.out.println("\nTest 3: Different Types");
        System.out.println("Groups: " + t1.size());

        System.out.println("\nTest 4: Empty List");
        List<Bogie> empty = new ArrayList<>();
        Map<String, List<Bogie>> t4 = groupBogies(empty);
        System.out.println("Size: " + t4.size());

        System.out.println("\nTest 5: Single Category");
        List<Bogie> single = new ArrayList<>();
        single.add(new Bogie("Sleeper", 60));
        Map<String, List<Bogie>> t5 = groupBogies(single);
        System.out.println("Keys: " + t5.keySet());

        System.out.println("\nTest 6: Map Contains Keys");
        System.out.println(t1.containsKey("Sleeper"));
        System.out.println(t1.containsKey("AC Chair"));

        System.out.println("\nTest 7: Group Size Validation");
        System.out.println("Sleeper size: " + t1.get("Sleeper").size());

        System.out.println("\nTest 8: Original List Unchanged");
        System.out.println("Before: " + bogies.size());
        groupBogies(bogies);
        System.out.println("After: " + bogies.size());
    }
}