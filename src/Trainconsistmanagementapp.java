import java.util.*;

public class Trainconsistmanagementapp {

    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return true; // found
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};
        String searchKey = "BG309";

        boolean result = linearSearch(bogieIds, searchKey);

        if (result) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}