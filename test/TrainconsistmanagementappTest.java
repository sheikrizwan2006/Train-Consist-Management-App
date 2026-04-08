import java.util.regex.*;

public class TrainconsistmanagementappTest {

    static boolean validateTrainID(String id) {
        return Pattern.matches("TRN-\\d{4}", id);
    }

    static boolean validateCargoCode(String code) {
        return Pattern.matches("PET-[A-Z]{2}", code);
    }

    public static void main(String[] args) {

        System.out.println("Test 1: Valid Train ID");
        System.out.println(validateTrainID("TRN-1234"));

        System.out.println("\nTest 2: Invalid Train ID");
        System.out.println(validateTrainID("TRAIN12"));

        System.out.println("\nTest 3: Valid Cargo Code");
        System.out.println(validateCargoCode("PET-AB"));

        System.out.println("\nTest 4: Invalid Cargo Code");
        System.out.println(validateCargoCode("PET-ab"));

        System.out.println("\nTest 5: Train ID Digit Length");
        System.out.println(validateTrainID("TRN-123"));   // false
        System.out.println(validateTrainID("TRN-12345")); // false

        System.out.println("\nTest 6: Cargo Uppercase Check");
        System.out.println(validateCargoCode("PET-XY"));
        System.out.println(validateCargoCode("PET-xY"));

        System.out.println("\nTest 7: Empty Input");
        System.out.println(validateTrainID(""));
        System.out.println(validateCargoCode(""));

        System.out.println("\nTest 8: Exact Pattern Match");
        System.out.println(validateTrainID("TRN-1234X")); // false
        System.out.println(validateCargoCode("PET-ABC")); // false
    }
}