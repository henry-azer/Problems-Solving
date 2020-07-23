package com.Projects;

import java.util.Scanner;

public class CharacterInUnicode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = scanner.nextLine();
        char ch = s.charAt(0);

        System.out.println((int) ch);
    }
}