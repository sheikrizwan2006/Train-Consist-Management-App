import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainconsistmanagementappTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        Trainconsistmanagementapp.sortBogieNames(arr);
        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        Trainconsistmanagementapp.sortBogieNames(arr);
        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        Trainconsistmanagementapp.sortBogieNames(arr);
        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        Trainconsistmanagementapp.sortBogieNames(arr);
        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        Trainconsistmanagementapp.sortBogieNames(arr);
        assertArrayEquals(
                new String[]{"Sleeper"},
                arr
        );
    }
}