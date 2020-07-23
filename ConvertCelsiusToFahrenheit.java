package com.Projects;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Celsius degree: ");
        double celsius = scanner.nextDouble();

        if (celsius == 0)
            throw new IllegalArgumentException();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.print("The fahrenheit degree is: " + fahrenheit);
    }
}
