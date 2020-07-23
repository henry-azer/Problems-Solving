package com.Projects;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1)Scissor - (2)Rock - (3)Paper ?\n(Choose): ");
        int choice = scanner.nextInt();

        if (!(choice == 1 || choice == 2 || choice == 3))
            throw new IllegalArgumentException();

        Random rnd = new Random();
        int rand = (rnd.nextInt(3));

        if (rand == 0)
            System.out.println((choice == 1) + "\nIt's Scissor !");

        else if (rand == 1)
            System.out.println((choice == 2) + "\nIt's Rock !");

        else
            System.out.println((choice == 3) + "\nIt's Paper !");

    }
}
