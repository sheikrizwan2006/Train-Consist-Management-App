import java.util.*;

public class Trainconsistmanagementapp {

    public static boolean binarySearch(String[] arr, String key) {

        Arrays.sort(arr); // ensure sorted

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};
        String key = "BG309";

        boolean result = binarySearch(bogieIds, key);

        if (result) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}