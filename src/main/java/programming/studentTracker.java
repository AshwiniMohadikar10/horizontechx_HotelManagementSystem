package programming;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        int numberOfStudents;
        int total = 0;
        int highest;
        int lowest;

        System.out.println("STUDENT GRADE TRACKER");
       

        System.out.print("Enter number of students: ");
        numberOfStudents = sc.nextInt();
        sc.nextLine();

        // Input student details
        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Student Grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            studentNames.add(name);
            studentGrades.add(grade);
        }

        highest = studentGrades.get(0);
        lowest = studentGrades.get(0);

        // Calculate total, highest and lowest
        for (int grade : studentGrades) {

            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / numberOfStudents;
        
        System.out.println("\n");
        System.out.println("STUDENT SUMMARY REPORT");
        

        System.out.printf("%-20s %-10s\n", "Student Name", "Grade");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-20s %-10d\n",
                    studentNames.get(i),
                    studentGrades.get(i));
        }

        System.out.println("\n");
        System.out.println("Total Students : " + numberOfStudents);
        System.out.printf("Average Grade  : %.2f\n", average);
        System.out.println("Highest Grade  : " + highest);
        System.out.println("Lowest Grade   : " + lowest);

        
    }
}
