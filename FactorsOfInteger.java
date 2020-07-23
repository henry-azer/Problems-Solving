package com.Projects;

import java.util.Scanner;

public class FactorsOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter An Integer: ");
        int integer = scanner.nextInt();
        int test = 2;

        System.out.print("Factors of " + integer + " is = [");
        while (integer / test != 1) {
            if (integer % test == 0) {
                System.out.print(test + ", ");
                integer /= test;
            }
            else
                test++;
        }
        System.out.println(integer + "]");
    }
}