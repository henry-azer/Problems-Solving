package com.Projects;

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.print("\n");
            for (int j = 1; j < i + 1; j++)
                System.out.print(" *");
        }

        for (int i = 10 ; i >= 1; i--) {
            System.out.print("\n");
            for (int j = 1; j < i + 1; j++)
                System.out.print(" *");
        }

    }
}
