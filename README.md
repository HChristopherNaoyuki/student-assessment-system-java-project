# Student Assessment System

The **Student Assessment System** is a Java-based application designed to manage and evaluate student performance across multiple tests. It calculates test averages, identifies failures, and determines eligibility for exam entry based on CASS (Continuous Assessment) marks.

## Features

- **Test Management:** Allows you to manage multiple tests for a given set of students.
- **Average Calculation:** Computes the average score for each test.
- **Failure Tracking:** Identifies the number of students who failed each test (scores below 40).
- **CASS Marks Calculation:** Calculates CASS marks for each student based on their test scores and determines exam entry eligibility.

## Project Structure

```
Solution/
├── MainApp.java              // Main entry point for testing the program
├── StudentAssessment.java    // Class for handling student assessment logic
└── TestScores.java           // Class for managing and calculating test scores
```

- **MainApp.java:** Contains the main method where test data is initialized, and methods to calculate averages, failures, and CASS marks are executed.
- **TestScores.java:** Manages the test scores, calculates averages, finds the test with the highest average, and tracks failures.
- **StudentAssessment.java:** Calculates CASS marks for each student and prints the eligibility for exam entry.

## How It Works

1. **Initialize Test Scores:** Scores for each test and student are provided in arrays.
2. **Calculate Averages:** The average score for each test is calculated and printed.
3. **Determine Failures:** The number of students failing each test is calculated and displayed.
4. **CASS Marks Calculation:** Each student's CASS mark is calculated as the average of their test scores, and eligibility for exam entry is determined based on whether their CASS mark is above 40.

## Example Output

```
*************************************************
Average Scores for Each Test
*************************************************
Test 1: 64.60
Test 2: 59.00
Test 3: 66.25
*************************************************
Test with Highest Average: Test 3
*************************************************
Failures in Each Test
*************************************************
Test 1: 1 failures
Test 2: 1 failures
Test 3: 1 failures
*************************************************
STUDENT      CASS MARK    EXAM ENTRY
0            61.67        Yes
1            60.67        Yes
2            39.67        No
3            79.33        Yes
4            74.33        Yes
*************************************************
```

## How to Run

1. Clone this repository to your local machine:
   ```
   git clone https://github.com/HChristopherNaoyuki/student-assessment-system-java-project.git
   ```

2. Navigate to the project directory and compile the Java files:
   ```
   javac Solution/*.java
   ```

3. Run the `MainApp` class:
   ```
   java Solution.MainApp
   ```

---
