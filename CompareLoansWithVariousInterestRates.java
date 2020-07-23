package com.Projects;

import java.util.Scanner;

public class CompareLoansWithVariousInterestRates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The loan amount: ");
        int loanAmount = scanner.nextInt();

        System.out.print("Enter The number of Years: ");
        int years = scanner.nextInt();

        System.out.print("Enter Interest Rate\nThe beginning: ");
        int beginningRate = scanner.nextInt();
        System.out.print("The end: ");
        int endRate = scanner.nextInt();

        System.out.print("Increase By: ");
        float incRate = scanner.nextFloat();

        System.out.println("Interest Rate\tMonthly Payment\t\tToTal Payment");
        for (float interestRate = beginningRate; interestRate <= endRate; interestRate+=incRate) {
            float monthlyPayment = (float) calculateMonthlyPayment(loanAmount, years,interestRate);
            float totalPayment = monthlyPayment * 12;

            System.out.println(interestRate + "%\t\t\t" + monthlyPayment + "$\t\t\t" + totalPayment + "$");
        }
    }

    public static double calculateMonthlyPayment(
            int loanAmount, int termInYears, double interestRate) {

        interestRate /= 100.0;

        double monthlyRate = interestRate / 12.0;

        int termInMonths = termInYears * 12;

        return (loanAmount*monthlyRate) /
                (1-Math.pow(1+monthlyRate, -termInMonths));
    }
}
