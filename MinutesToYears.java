package com.Projects;

import java.util.Scanner;

public class MinutesToYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Minutes: ");
        long min = scanner.nextLong();

        // year = 365 day
        int years = 0;
        long days = (min / 60) / 24;

        while(days >= 365) {
            for (int i = 0; i < days; i += 365) {
                years += 1;
                days -= 365;
            }
        }
        System.out.println(min + " Minutes is approximately " + years + " Years and " + days + " Days");
    }
}
