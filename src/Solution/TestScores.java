package Solution;

// TestScores.java

public class TestScores 
{
    private final int[][] scores;
    private final int numTests;
    private final int numStudents;

    public TestScores(int numTests, int numStudents) 
    {
        this.numTests = numTests;
        this.numStudents = numStudents;
        this.scores = new int[numTests][numStudents];
    }

    public void setScores(int testIndex, int[] testScores) 
    {
        scores[testIndex] = testScores;
    }

    public double[] calculateTestAverages() 
    {
        double[] averages = new double[numTests];
        for (int i = 0; i < numTests; i++) 
        {
            int sum = 0;
            for (int score : scores[i]) 
            {
                sum += score;
            }
            averages[i] = (double) sum / numStudents;
        }
        return averages;
    }

    public int findHighestAverageTest(double[] averages) 
    {
        int highestIndex = 0;
        double highestAvg = averages[0];
        for (int i = 1; i < averages.length; i++) 
        {
            if (averages[i] > highestAvg) 
            {
                highestAvg = averages[i];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public int[] calculateFailures() 
    {
        int[] failures = new int[numTests];
        for (int i = 0; i < numTests; i++) 
        {
            int count = 0;
            for (int score : scores[i]) 
            {
                if (score < 40) 
                {
                    count++;
                }
            }
            failures[i] = count;
        }
        return failures;
    }

    public int[] getStudentScores(int studentIndex) 
    {
        int[] studentScores = new int[numTests];
        for (int i = 0; i < numTests; i++) 
        {
            studentScores[i] = scores[i][studentIndex];
        }
        return studentScores;
    }
}
