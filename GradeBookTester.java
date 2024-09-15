import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1;
    private GradeBook g2;

    @BeforeEach
    public void setUp() {
        // GradeBook size of 5
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        // Add scores to g1 and g2
        g1.addScore(50);
        g1.addScore(75);

        g2.addScore(30);
        g2.addScore(60);
    }

    @AfterEach
    public void tearDown() {
        // Set objects to null
        g1 = null;
        g2 = null;
    }

    // Test for addScore method
    @Test
    public void testAddScore() {
        assertTrue(g1.toString().equals("50.0 75.0"), "The scores should be '50.0 75.0'");
        assertTrue(g2.toString().equals("30.0 60.0"), "The scores should be '30.0 60.0'");

        assertEquals(2, g1.getScoreSize(), "Score size for g1 should be 2");
        assertEquals(2, g2.getScoreSize(), "Score size for g2 should be 2");
    }

    // Test for sum method
    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.0001, "The sum for g1 should be 125.0");
        assertEquals(90.0, g2.sum(), 0.0001, "The sum for g2 should be 90.0");
    }

    // Test for minimum method
    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.0001, "The minimum score should be 50.0");
        assertEquals(30.0, g2.minimum(), 0.0001, "The minimum score should be 30.0");
    }

    // Test for finalScore method
    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.0001, "The final score should be 75.0");
        assertEquals(60.0, g2.finalScore(), 0.0001, "The final score should be 60.0");
    }
}
