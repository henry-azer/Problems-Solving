/*
 *Author: Henry Azer, 220190314
 *Date: 12-3-2020
 *Programming lag Java - Assignment 01 - DiamondShape
 */
package com.Projects;

public class DiamondShape {

    public static void main(String[] args) {

        diamondShapePerRow(10);

    }

    public static void diamondShapePerRow(int n) {

        int space = n -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            space--;
        }

        space = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
            space++;
        }
    }
}