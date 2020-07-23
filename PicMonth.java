package com.Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PicMonth {

    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.print("Choose a num: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int month = scanner.nextInt();
            System.out.print(months[month]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Index is out of bounds");
        } catch (InputMismatchException exception) {
            System.out.print("Input mismatch");
        }

    }

}
