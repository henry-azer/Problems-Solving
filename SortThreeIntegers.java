package com.Projects;

import java.util.Scanner;

public class SortThreeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three Numbers");

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Num3: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Numbers is equal others.");
            throw new IllegalStateException();
        }

        if (num1 >= num2) {
            if (num1 >= num3 && num2 >= num3)
                System.out.println("Sorting is: [" + num3 + ", " + num2 + ", " + num1 + "]");
            else if (num1 > num3)
                System.out.println("Sorting is: [" + num3 + ", " + num2 + ", " + num3 + "]");
        }

        if (num2 >= num1) {
            if (num2 >= num3 && num1 >= num3)
                System.out.println("Sorting is: [" + num3 + ", " + num1 + ", " + num2 + "]");
            else if (num2 >= num3)
                System.out.println("Sorting is: [" + num1 + ", " + num3 + ", " + num2 + "]");
        }

        if (num3 >= num1) {
            if (num3 >= num2 && num1 >= num2)
                System.out.println("Sorting is: [" + num2 + ", " + num1 + ", " + num3 + "]");
            else if (num3 >= num2)
                System.out.println("Sorting is: [" + num1 + ", " + num2 + ", " + num3 + "]");
        }
    }
}
