package com.ProblemSolving;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num = getNum();
        System.out.println(factorialIterative(num));
        System.out.println(factorialRecursion(num));
    }

    public static int factorialIterative(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++)
            factorial *= i ;

        return factorial;
    }

    public static int factorialRecursion(int number) {
        if (number == 0)
            return 1;
        return number * factorialRecursion( number - 1);
    }

    private static int getNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        return scanner.nextInt();

    }
}
