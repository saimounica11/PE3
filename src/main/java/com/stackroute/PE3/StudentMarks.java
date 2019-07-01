package com.stackroute.PE3;
import java.util.Scanner;

public class StudentMarks {

    public String check(int stuGrades[], int NumOfStudents) {
        for (int i = 0; i < NumOfStudents; i++)

            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return "Error";
            }

        return "All marks are correct";
    }
}
