package Solution;

// StudentAssessment.java

public class StudentAssessment 
{
    private final TestScores testScores;
    private final int numStudents;

    public StudentAssessment(TestScores testScores, int numStudents) 
    {
        this.testScores = testScores;
        this.numStudents = numStudents;
    }

    public double[] calculateCASSMarks() 
    {
        double[] cassMarks = new double[numStudents];
        for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) 
        {
            int[] studentScores = testScores.getStudentScores(studentIndex);
            int sum = 0;
            for (int score : studentScores) 
            {
                sum += score;
            }
            cassMarks[studentIndex] = (double) sum / studentScores.length;
        }
        return cassMarks;
    }

    public void printCASSMarksAndEligibility(double[] cassMarks) 
    {
        System.out.println("STUDENT\t\tCASS MARK\tEXAM ENTRY");
        for (int i = 0; i < cassMarks.length; i++) 
        {
            String eligibility = cassMarks[i] > 40 ? "Yes" : "No";
            System.out.printf("%d\t\t%.2f\t\t%s%n", i, cassMarks[i], eligibility);
        }
    }
}
