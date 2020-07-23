package com.Projects;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrenceOfMaxNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tOccurrence Of Max Numbers");
        System.out.print("How many of Numbers: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter num " +  (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 0; i < num; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }

        int count = 0;
        for (int i = 0; i < num; i++) {
            if (max == numbers[i]) {
                count++;
            }
        }

        System.out.println("\nMax number is: " + max);
        System.out.println("The occurrence count of the largest number is: " + count );
        System.out.println("Numbers you write " + Arrays.toString(numbers));
    }
}
