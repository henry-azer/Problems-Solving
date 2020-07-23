package com.Projects;

import java.util.Scanner;

public class SumOfThreeNums {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a num: ");
        int nums = scanner.nextInt();

        if (nums > 999 || nums < 0)
            throw new IllegalArgumentException();

        int num1 = nums / 10;
        int num2 = num1 / 10;
        int num3 = num1 % 10;
        int num4 = nums % 10;

        System.out.println(num2 + num3 + num4);
    }
}
