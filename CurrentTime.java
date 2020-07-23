package com.Projects;

import java.util.Scanner;

public class CurrentTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();

        System.out.print("Enter the time zone offset to GMT: ");
        int GMT = scanner.nextInt();
        if (GMT < -12 || GMT > 12 )
            throw new IllegalArgumentException();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        currentHour += GMT;
        if (currentHour == 24)
            currentHour = 0;
        else if (currentHour > 24)
            currentHour = (currentHour - 24);

        System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
