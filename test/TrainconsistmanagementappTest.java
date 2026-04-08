import java.util.*;
import java.util.stream.*;

public class TrainconsistmanagementappTest {

    static boolean checkSafety(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );
    }

    public static void main(String[] args) {

        System.out.println("Test 1: All Bogies Valid");
        List<GoodsBogie> t1 = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal")
        );
        System.out.println(checkSafety(t1));

        System.out.println("\nTest 2: Cylindrical with Invalid Cargo");
        List<GoodsBogie> t2 = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );
        System.out.println(checkSafety(t2));

        System.out.println("\nTest 3: Non-Cylindrical Allowed");
        List<GoodsBogie> t3 = Arrays.asList(
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );
        System.out.println(checkSafety(t3));

        System.out.println("\nTest 4: Mixed with Violation");
        List<GoodsBogie> t4 = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Cylindrical", "Coal")
        );
        System.out.println(checkSafety(t4));

        System.out.println("\nTest 5: Empty List");
        List<GoodsBogie> t5 = new ArrayList<>();
        System.out.println(checkSafety(t5));
    }
}