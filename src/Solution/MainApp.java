package Solution;

// MainApp.java

public class MainApp 
{
    public static void main(String[] args) 
    {
        int numTests = 3;
        int numStudents = 5;

        // Initialize TestScores and StudentAssessment
        TestScores testScores = new TestScores(numTests, numStudents);
        StudentAssessment studentAssessment = new StudentAssessment(testScores, numStudents);

        // Sample scores for each test
        int[] test1 = {55, 67, 34, 78, 89};
        int[] test2 = {40, 35, 60, 70, 55};
        int[] test3 = {45, 88, 25, 90, 77};

        // Set test scores
        testScores.setScores(0, test1);
        testScores.setScores(1, test2);
        testScores.setScores(2, test3);

        // Calculate and print averages
        double[] averages = testScores.calculateTestAverages();
        System.out.println("*************************************************");
        System.out.println("Average Scores for Each Test");
        System.out.println("*************************************************");
        for (int i = 0; i < averages.length; i++) 
        {
            System.out.printf("Test %d: %.2f%n", i + 1, averages[i]);
        }

        // Determine and print the test with the highest average
        int highestTestIndex = testScores.findHighestAverageTest(averages);
        System.out.println("*************************************************");
        System.out.printf("Test with Highest Average: Test %d%n", highestTestIndex + 1);
        System.out.println("*************************************************");

        // Calculate and print failures for each test
        int[] failures = testScores.calculateFailures();
        System.out.println("Failures in Each Test");
        System.out.println("*************************************************");
        for (int i = 0; i < failures.length; i++) 
        {
            System.out.printf("Test %d: %d failures%n", i + 1, failures[i]);
        }
        System.out.println("*************************************************");

        // Calculate CASS marks and print eligibility
        double[] cassMarks = studentAssessment.calculateCASSMarks();
        studentAssessment.printCASSMarksAndEligibility(cassMarks);
        System.out.println("*************************************************");
    }
}
