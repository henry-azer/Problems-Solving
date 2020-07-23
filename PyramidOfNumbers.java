package com.Projects;

import java.util.Scanner;

public class PyramidOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines\n(Max 10): ");
        int lines = scanner.nextInt();
        if (lines > 10)
            throw new IllegalArgumentException();

        System.out.println();

        for (int i = 1; i <= lines; i++) {

            if (i < 10)
                System.out.print(" ");

            for (int j = lines - i; j >= 1; j--) {
                System.out.print("   ");

            }
            for (int r = i; r >= 2; r--) {
                System.out.print(r + "  ");
            }

            for (int u = 1; u <= i; u++) {
                System.out.print(u + "  ");
            }
            System.out.println();
        }
    }
}
