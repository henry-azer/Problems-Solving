package com.Projects;

import java.util.Scanner;

public class CompoundValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount you save($): ");
        int money = scanner.nextInt();

        System.out.print("Enter the annual interest rate(%): ");
        float rate = scanner.nextInt();

        System.out.print("How many months: ");
        int months = scanner.nextInt();

        float monthlyInterestRate = (rate / 100 / 12);
        float moneyAfter = money * (1 + monthlyInterestRate);
        int count = 1;

        while (months > count) {
            moneyAfter = ((money + moneyAfter) * (1 + monthlyInterestRate));
            count++;
        }

        System.out.println("After " + months + " months, The account value is $" + moneyAfter);
    }
}
