package com.Projects;

import java.util.Scanner;

public class ClockCountDown {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tClockCountDown\nEnter Minuets: ");
        int min = scanner.nextInt();
        System.out.print("Enter Seconds: ");
        int sec = scanner.nextInt();

        int allSec = (min * 60) + sec;

        for (int i = 0; i < allSec; i++) {
            if (sec == 0  && min > 0) {
                min -= 1;
                sec = 60;
            }
            System.out.println(min + " Minuets " + sec-- + " Seconds remaining.");
        }
        System.out.println("Stopped.");
    }
}
