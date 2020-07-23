package com.Projects;

import java.util.Scanner;

public class FinancialApplicationCalculateTips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Subtotal rate: ");
        float subtotal = scanner.nextFloat();
        System.out.print("Enter the Gratuity rate: ");
        float gratuity = scanner.nextFloat();

        if (gratuity < 0 || subtotal < 0)
            throw new IllegalArgumentException();

        double gratuityS = gratuity / 10;
        double subtotalS = gratuityS + 10;

        System.out.println("The Gratuity is $" + gratuityS + " And Total is $" + subtotalS);
    }
}
