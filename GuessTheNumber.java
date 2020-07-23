package com.Projects;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randNum = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Try to Guss the number bet(1-100)");

        for (int i = 10; i > 0; i--) {
            System.out.print("You have " + i + " Guss left! \nChoose: ");
            int guss = scanner.nextInt();

            if (randNum < guss)
                System.out.println("It is smaller than " + guss + " !!\n");

            if (randNum > guss)
                System.out.println("It is greater than " + guss + " !!\n");

            if (randNum == guss) {
                hasWon = true;
                break;
            }
        }

        if (hasWon)
            System.out.println("\nWinner !! \nCorrect, The number is: " + randNum );
        else
            System.out.println("Looser !! \nFalse, The Number is: " + randNum);

        System.out.println("Game Over !!");
    }
}
