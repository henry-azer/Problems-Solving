package com.Projects;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1)Head Or (2)Tail ?\n(Choose): ");
        int choice = scanner.nextInt();

        if (!(choice == 1 || choice == 2))
            throw new IllegalArgumentException();


        Random rnd = new Random();
        boolean rand = rnd.nextBoolean();

        if (rand)
            System.out.println((choice == 1) + "\nIt's Head !");

        else
            System.out.println((choice == 2) + "\nIt's Tail !");
    }
}
