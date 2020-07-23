package com.Projects;

import java.util.Scanner;

public class ConvertFeetIntoMeters {

    public static void main(String[] argd) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Feets? : ");
        float feet = scanner.nextFloat();

        if (feet < 0)
            throw new IllegalArgumentException();

        double meters = feet * 0.305;

        System.out.println(feet + " Feet is " + meters + " Meters");
    }
}
