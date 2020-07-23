package com.Projects;

import java.util.Scanner;

public class DistanceOfTwoPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two Points");
        System.out.print("X1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Y1: ");
        float y1 = scanner.nextFloat();

        System.out.print("X2: ");
        float x2 = scanner.nextFloat();
        System.out.print("Y2: ");
        float y2 = scanner.nextFloat();

        float distance = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance between the two points is = " + distance);
    }
}