package com.ilivinskyi;

import unittesting.JewelsAndStonedSolver;
import unittesting.NumberOfGoodPairsSolver;

public class Main {

    public static void main(String[] args) {
        // Jewels and Stones
        var jewelsAndStonesSolver = new JewelsAndStonedSolver();
        System.out.println(jewelsAndStonesSolver.numJewelsInStones("z", "ZZZZ"));

        // Number of good pairs
        var numberOfGoodPairsSolver = new NumberOfGoodPairsSolver();
        System.out.println(
                numberOfGoodPairsSolver.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})
        );
    }
}
