package com.Projects;

import java.util.Scanner;

public class Lottery {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lotteries you have ?: ");
        int numOfLotteries = scanner.nextInt();

        for (int i = 1; i <= numOfLotteries; i++) {
            System.out.print("\n" + "Enter Lottery number between(1 To 99): ");
            int number = scanner.nextInt();

            if (number >= 100)
                throw new IllegalArgumentException();

            int lottery = (int) (Math.random() * (99 - 1));
            System.out.println("Lottery is: " + lottery);

            int num1 = number / 10;
            int num2 = number % 10;       

            int lottery1 = lottery / 10;
            int lottery2 = lottery % 10;

            if (number == lottery)
                System.out.println("The lottery in exact order, Your award is $10,000.");

            else if ((num1 == lottery2) || (num2 == lottery1))
                System.out.println("The lottery is matches, Your award is $3.000.");

            else if (num1 == lottery1 || num2 == lottery2)
                System.out.println("The lottery matches a digit, the award is $1,000.");

            else
                System.out.println("Good Luck !! :)");
        }   
    }
}