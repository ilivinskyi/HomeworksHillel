package com.ilivinskyi.sockets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JewelsAndStonedSolverTest {

    JewelsAndStonedSolver solver;

    @BeforeEach
    void setUp() {
        solver = new JewelsAndStonedSolver();
    }

    @Test
    void testHasValidJewels() {
        var jewels = "aA";
        var stones = "aAAbbbb";
        var expected = 3;
        var actual = solver.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDoesntHaveValidJewels() {
        var jewels = "cC";
        var stones = "aAAbbbb";
        var expected = 0;
        var actual = solver.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testHasOnlyJewels() {
        var jewels = "aA";
        var stones = "";
        var expected = 0;
        var actual = solver.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testHasOnlyStones() {
        var jewels = "0";
        var stones = "aAAbbbb";
        var expected = 0;
        var actual = solver.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEmptyValues() {
        var jewels = "";
        var stones = "";
        var expected = 0;
        var actual = solver.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expected, actual);
    }
}
