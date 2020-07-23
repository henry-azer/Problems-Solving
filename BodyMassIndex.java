package com.Projects;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your body weight(pound): ");
        float weight = scanner.nextFloat();
        float weightKg = (float) (weight * 0.45359237);

        System.out.print("Enter your body height(inch): ");
        float height = scanner.nextFloat();
        float heightM = (float) (height * 0.0254);

        float BMI = weightKg / (heightM * heightM);

        System.out.println("Body Mass Index (IBM) is: " + BMI);

    }
}
