package com.Projects;

public class FourPatternsTriangleInverse {

    public static void main(String[] args) {
        patterA();
        patterB();
        patterC();
        patterD();
    }

    private static void patterA() {
        System.out.println("\n\tPattern (A)\n");

        for (int i = 1; i <= 6; i++){
            for (int r = 1; r <= i; r++) {
                System.out.print(r + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patterB() {
        System.out.println("\tPattern (B)\n");

        for (int i = 6; i >= 1; i--){
            for (int r = 1; r <= i; r++) {
                System.out.print(r + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patterC() {
        System.out.println("\tPattern (C)\n");
        int count = 1;

        for (int i = 6; i >= 1; i--) {

            for (int j = i; j >= 2; j--) {
                System.out.print("  ");
            }

            for (int k = count; k >= 1; k--) {
                System.out.print(k + " ");
            }
            count++;
            System.out.println();
        }
        System.out.println();
    }

    private static void patterD() {
        System.out.println("\tPattern (C)\n");
        int count = 0;

        for (int i = 6; i >= 1; i--) {

            for (int j = 0; j < count; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            count++;
            System.out.println();
        }
        System.out.println();
    }
}
