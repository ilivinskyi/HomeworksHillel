package unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfGoodPairsSolverTest {

    NumberOfGoodPairsSolver solver;

    @BeforeEach
    void setUp() {
        solver = new NumberOfGoodPairsSolver();
    }

    @Test
    void testArrayHasGoodPairs() {
        var testArray = new int[]{1, 2, 3, 1, 1, 3};
        var expectedOutput = 4;
        var actualOutput = solver.numIdenticalPairs(testArray);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testArrayDoesntHaveGoodPairs() {
        var testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        var expectedOutput = 0;
        var actualOutput = solver.numIdenticalPairs(testArray);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyArray() {
        var testArray = new int[]{};
        var expectedOutput = 0;
        var actualOutput = solver.numIdenticalPairs(testArray);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
