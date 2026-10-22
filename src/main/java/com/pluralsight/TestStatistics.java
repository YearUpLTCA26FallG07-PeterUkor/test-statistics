package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {63, 22, 35, 44, 87, 90, 42, 63, 93, 90};

        float average = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];
        int sum = 0;
        int median;

        for (int score: testScores){
            sum += score;
            if (score > highScore) {
                highScore = score;
            }
            if (score < lowScore) {
                lowScore = score;
            }
        }
        average = (float) sum / testScores.length;

        // calculate for median
        // sort the array then check if length of array is even or odd
        Arrays.sort(testScores);
        int middle = testScores.length / 2;

        if ((testScores.length % 2) == 0) {
            // cast to float and then round to get an int
            median = Math.round((float) (testScores[middle] + testScores[middle + 1]) / 2);
        } else {
            median = testScores[middle];
        }

        System.out.println("=== List information ===");
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);

    }
}
