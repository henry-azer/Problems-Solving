package com.Projects;

import java.util.Scanner;

public class LeapYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The leap years \nfrom: ");
        int from = scanner.nextInt();
        System.out.print("To: ");
        int to = scanner.nextInt();

        int count = 0;
        for (int i = from; i <= to; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
                System.out.print(i + (count % 10 == 0 ? "\n" : " "));
            }
        }
    }
}
