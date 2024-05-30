package com.example.gradecalculator;
import java.util.ArrayList;
import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> averages = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
          
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            double totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                double mark = scanner.nextDouble();
                totalMarks += mark;
            }
            double average = totalMarks / numSubjects;
            averages.add(average);
        }

        // Assign grades
        for (double average : averages) {
            String grade;
            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            grades.add(grade);
        }

        // Display grades
        System.out.println("Student Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Average Marks = " + averages.get(i) + ", Grade = " + grades.get(i));
        }
    }
}
