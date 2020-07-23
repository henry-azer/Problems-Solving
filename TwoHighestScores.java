package com.Projects;

import java.util.Scanner;

public class TwoHighestScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score, highest = 0, secondHighest = 0;
        String name, student1 = "", student2 = "";

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if (i == 0) {
                highest = score;
                student1 = name;
            }
            else if (i == 1 && score > highest) {
                secondHighest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            }
            else if (i == 1) {
                secondHighest = score;
                student2 = name;
            }
            else if (score > highest && score > secondHighest) {
                secondHighest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            }
            else if (score > secondHighest) {
                student2 = name;
                secondHighest = score;
            }
        }

        System.out.println("The Highest scoring student: " + student1 +
                "\nSecond The Highest scoring student: " + student2);
    }
}