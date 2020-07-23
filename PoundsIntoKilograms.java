package com.Projects;

import java.util.Scanner;

public class PoundsIntoKilograms {

    public static void main(String[] argd) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Pounds? : ");
        float pounds = scanner.nextFloat();

        if (pounds < 0)
            throw new IllegalArgumentException();

        double kiloGrams = pounds * 0.454;

        System.out.println(pounds + " Pounds is " + kiloGrams + " Kilograms");

        System.out.print("Do you need to know all changes? \n Choose(Y Or N): ");
        char choice = scanner.next().charAt(0);
    }
}