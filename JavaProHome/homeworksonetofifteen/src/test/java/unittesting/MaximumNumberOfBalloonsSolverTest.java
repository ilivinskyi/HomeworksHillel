package unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumNumberOfBalloonsSolverTest {

    MaximumNumberOfBalloonsSolver solver;

    @BeforeEach
    void setUp() {
        solver = new MaximumNumberOfBalloonsSolver();
    }

    @Test
    void testPositiveCase() {
        var testString = "loonbalxballpoon";
        var expected = 2;
        var actual = solver.maxNumberOfBalloons(testString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNegativeCase() {
        var testString = "dfasdsdasd";
        var expected = 0;
        var actual = solver.maxNumberOfBalloons(testString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        var testString = "";
        var expected = 0;
        var actual = solver.maxNumberOfBalloons(testString);
        Assertions.assertEquals(expected, actual);
    }
}
