import java.util.*;

public class Trainconsistmanagementapp {

    public static boolean searchBogie(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309"};
        String key = "BG205";

        boolean result = searchBogie(bogies, key);
        System.out.println(result ? "Found" : "Not Found");
    }
}