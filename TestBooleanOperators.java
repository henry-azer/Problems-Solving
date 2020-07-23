package com.Projects;

import java.util.Scanner;

public class TestBooleanOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        
        if ((num % 2 == 0) && (num % 3 == 0))
            System.out.println("Number is divisible by 2 and 3.");
        else if ((num % 2 == 0) || (num % 3 == 0))
            System.out.println("Number is divisible by 2 or 3.");
        else if ((num % 2 == 0) ^ (num % 3 == 0))
            System.out.println("Number is divisible by 2 or 3 but not both.");
        else
            System.out.println("Wrong input!!");
    }
}
