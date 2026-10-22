package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {63, 22, 35, 44, 87, 90, 42, 63, 93, 90};

        float average = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];
        int sum = 0;

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

        System.out.println("=== List information ===");
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Average: " + average);

    }
}
