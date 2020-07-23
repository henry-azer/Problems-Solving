package com.ProblemSolving;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int num = getKthNum();
        System.out.println(fibonacciIterative(num));
        System.out.println(fibonacciRecursion(num));
    }

    public static int fibonacciIterative(int number) {
        if (number <= 1)
            return number;

        int fibonacci = 1;
        int prevFibonacci = 1;

        for (int i = 2; i < number; i++) {
            int temp = fibonacci;
            fibonacci += prevFibonacci;
            prevFibonacci = temp;
        }

        return fibonacci;
    }

    public static int fibonacciRecursion(int number) {
        if (number <= 1)
            return number;
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    private static int getKthNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Kth number: ");
        return scanner.nextInt();

    }
}
