package com.Projects;

import java.util.Scanner;

public class CharacterOfASCII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1)ASCII To Number\n(2)Number TO ASCII\n(1 Or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("\nEnter a Character: ");
            char numCh = scanner.next().charAt(0);

            System.out.println("ASCII is: " + numCh);
            System.out.println("Character is: " + (int) numCh);

        } else if (choice == 2) {
            System.out.print("Enter a Number: ");
            int num = scanner.nextInt();

            System.out.println("Character is: " + num);
            System.out.print("ASCII is: " + (char) num);
        } else
            throw new IllegalArgumentException();
    }
}
