package com.Projects;

import java.util.Scanner;

public class MathQuiz {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("MathQuiz\n(1)Addition -(2)Subtraction - (3)Multiply (4)Division\n(choose): ");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            System.out.print("(1)Easy -(2)Medium - (3)Hard\n(choose): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1)
                EasyAdd();

            else if (choice2 == 2)
                MediumAdd();

            else if (choice2 == 3)
                HardAdd();

        } else if (choice1 == 2) {
            System.out.print("(1)Easy -(2)Medium - (3)Hard\n(choose): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1)
                EasySub();

            else if (choice2 == 2)
                MediumSub();

            else if (choice2 == 3)
                HardSub();

        } else if (choice1 == 3) {
            System.out.print("(1)Easy -(2)Medium - (3)Hard\n(choose): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1)
                EasyMulti();

            else if (choice2 == 2)
                MediumMulti();

            else if (choice2 == 3)
                HardMulti();

        } else if (choice1 == 4) {
            System.out.print("(1)Easy -(2)Medium - (3)Hard\n(choose): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1)
                EasyDiv();

            else if (choice2 == 2)
                MediumDiv();

            else if (choice2 == 3)
                HardDiv();

        } else if (choice1 < 4)
            throw new IllegalArgumentException();
    }


    public static int Easy() {
        return (int) (Math.random() * 10);
    }

    public static int Medium() {
        return (int) (Math.random() * 100);
    }

    public static int Hard() {
        return (int) (System.currentTimeMillis() % 1000);
    }


    public static void EasyAdd() {
        int num1 = Easy();
        int num2 = Easy();

        System.out.print("What is ?\n" + num1 + " + " + num2 + " = ");
        int result = scanner.nextInt();

        System.out.print(num1 + " + " + num2 + " = " + result + "\nis " + ((num1 + num2) == result) + "\nAnswer is " + (num1 + num2));
    }

    public static void MediumAdd() {
        int num1 = Medium();
        int num2 = Medium();

        System.out.print("What is ?\n" + num1 + " + " + num2 + " = ");
        int result = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + result + "\nis " + ((num1 + num2) == result) + "\nAnswer is " + (num1 + num2));
    }

    public static void HardAdd() {
        int num1 = Hard();
        int num2 = Hard();

        System.out.print("What is ?\n" + num1 + " + " + num2 + " = ");
        int result = scanner.nextInt();

        System.out.print(num1 + " + " + num2 + " = " + result + "\nis " + ((num1 + num2) == result) + "\nAnswer is " + (num1 + num2));
    }


    public static void EasySub() {
        int num1 = Easy();
        int num2 = Easy();

        System.out.print("What is ?\n" + num1 + " - " + num2 + " = ");
        int result = scanner.nextInt();

        System.out.print(num1 + " - " + num2 + " = " + result + "\nis " + ((num1 - num2) == result) + "\nAnswer is " + (num1 - num2));
    }

    public static void MediumSub() {
        int num1 = Medium();
        int num2 = Medium();

        System.out.print("What is ?\n" + num1 + " - " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.print(num1 + " - " + num2 + " = " + result + "\nis " + ((num1 - num2) == result) + "\nAnswer is " + (num1 - num2));
    }

    public static void HardSub() {
        int num1 = Hard();
        int num2 = Hard();

        System.out.print("What is ?\n" + num1 + " - " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.print(num1 + " - " + num2 + " = " + result + "\nis " + ((num1 - num2) == result) + "\nAnswer is " + (num1 - num2));
    }


    public static void EasyMulti() {
        int num1 = Easy();
        int num2 = Easy();

        System.out.print("What is ?\n" + num1 + " * " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + result + "\nis " + ((num1 * num2) == result) + "\nAnswer is " + (num1 * num2));
    }

    public static void MediumMulti() {
        int num1 = Medium();
        int num2 = Medium();

        System.out.print("What is ?\n" + num1 + " * " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + result + "\nis " + ((num1 * num2) == result) + "\nAnswer is " + (num1 * num2));
    }

    public static void HardMulti() {
        int num1 = Hard();
        int num2 = Hard();

        System.out.print("What is ?\n" + num1 + " * " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + result + "\nis " + ((num1 * num2) == result) + "\nAnswer is " + (num1 * num2));
    }


    public static void EasyDiv() {
        int num1 = Easy();
        int num2 = Easy();

        System.out.print("What is ?\n" + num1 + " / " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.print(num1 + " / " + num2 + " = " + result + "\nis " + ((num1 / num2) == result) + "\nAnswer is " + (num1 / num2));
    }

    public static void MediumDiv() {
        int num1 = Medium();
        int num2 = Medium();

        System.out.print("What is ?\n" + num1 + " / " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.print(num1 + " / " + num2 + " = " + result + "\nis " + ((num1 / num2) == result) + "\nAnswer is " + (num1 / num2));
    }

    public static void HardDiv() {
        int num1 = Hard();
        int num2 = Hard();

        System.out.print("What is ?\n" + num1 + " / " + num2 + " = ");
        int result = scanner.nextInt();
        System.out.print(num1 + " / " + num2 + " = " + result + "\nis " + ((num1 / num2) == result) + "\nAnswer is " + (num1 / num2));
    }
}
