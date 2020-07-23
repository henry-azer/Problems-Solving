/*
 *Author: Henry Azer, 220190314
 *Date: 12-3-2020
 *Programming lag Java - Assignment 01 - TriangleShapes
 */
package com.Projects;

public class TriangleShapes {

    public static void main(String[] args) {

        isoscelesTriangle(11);
        equilateralTriangle(11);
        rightAngledTriangle(11);
        scaleneTriangle(11);

    }

    public static void isoscelesTriangle(int numberOfRows) {

        System.out.println("\tIsosceles Triangle\n");

        int space = numberOfRows - 1;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
            space--;
        }

        System.out.println("\n");
    }

    public static void equilateralTriangle(int numberOfRows) {

        System.out.println("\tEquilateral Triangle\n");

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = i; j < numberOfRows; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        System.out.println("\n");
    }

    public static void rightAngledTriangle(int numberOfRows) {

        System.out.println("\tRight Angled Triangle\n");

        for (int i = 0; i < numberOfRows; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        System.out.println("\n");
    }

    public static void scaleneTriangle(int numberOfRows) {

        System.out.println("\tScalene Triangle\n");

        int space = 0;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
            space++;
        }
    }
}