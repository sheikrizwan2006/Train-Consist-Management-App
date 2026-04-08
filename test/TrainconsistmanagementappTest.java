import java.util.*;
import java.util.stream.*;

public class TrainconsistmanagementappTest {

    static List<Bogie> loopFilter(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    static List<Bogie> streamFilter(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        System.out.println("Test 1: Loop Filtering");
        System.out.println(loopFilter(bogies).size());

        System.out.println("\nTest 2: Stream Filtering");
        System.out.println(streamFilter(bogies).size());

        System.out.println("\nTest 3: Result Consistency");
        System.out.println(loopFilter(bogies).size() == streamFilter(bogies).size());

        System.out.println("\nTest 4: Execution Time Measurement");
        long start = System.nanoTime();
        loopFilter(bogies);
        long end = System.nanoTime();
        System.out.println((end - start) > 0);

        System.out.println("\nTest 5: Large Dataset");
        List<Bogie> large = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            large.add(new Bogie("Sleeper", i % 100));
        }
        System.out.println(streamFilter(large).size());
    }
}