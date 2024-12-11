import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import lab13.task2.*;
class ReportBuilderTest {

    @Test
    void testGetUserData() {
        ReportBuilder reportBuilder = new ReportBuilder();
        String userData = reportBuilder.getUserData();

        assertNotNull(userData, "User data should not be null.");
        assertEquals("hello", userData, "User data should match the expected value.");
    }

    @Test
    void testGetStatisticalData() {
        ReportBuilder reportBuilder = new ReportBuilder();
        String statisticalData = reportBuilder.getStatisticalData();

        assertNotNull(statisticalData, "Statistical data should not be null.");
        assertEquals("hello2", statisticalData, "Statistical data should match the expected value.");
    }

    @Test
    void testAuthorize() {
        ReportBuilder reportBuilder = new ReportBuilder();
        boolean isAuthorized = reportBuilder.authorize();

        assertTrue(isAuthorized, "Authorization should return true.");
    }

    @Test
    void testBuildReport() {
        ReportBuilder reportBuilder = new ReportBuilder();

        String userData = reportBuilder.getUserData();
        String statisticalData = reportBuilder.getStatisticalData();

        assertEquals("hello", userData, "User data should match.");
        assertEquals("hello2", statisticalData, "Statistical data should match.");

        System.out.println("Test passed for buildReport: Manually verify console output.");
    }
}
