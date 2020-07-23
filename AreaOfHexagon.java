package com.Projects;

import java.util.Scanner;

public class AreaOfHexagon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        float side = scanner.nextFloat();

        float area = (float) (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;

        System.out.println("The area of the hexagon is: " + area);

    }
}
