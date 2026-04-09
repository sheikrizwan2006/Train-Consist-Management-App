import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainconsistmanagementappTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};
        assertThrows(IllegalStateException.class, () -> {
            Trainconsistmanagementapp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101","BG205"};
        assertDoesNotThrow(() -> {
            Trainconsistmanagementapp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        assertTrue(Trainconsistmanagementapp.searchBogie(arr, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        assertFalse(Trainconsistmanagementapp.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};
        assertTrue(Trainconsistmanagementapp.searchBogie(arr, "BG101"));
    }
}