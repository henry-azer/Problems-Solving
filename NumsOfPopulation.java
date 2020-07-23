package com.Projects;

import java.util.Scanner;

public class NumsOfPopulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long newPopulation = 0;

        System.out.print("Enter th Number of Populations: ");
        long population = scanner.nextInt();
        System.out.print("Enter how many years to count: ");
        int years = scanner.nextInt();

        System.out.print("Enter how many seconds per birth: ");
        int perBirth = birth(scanner.nextInt(), years);
        System.out.print("Enter how many seconds per death: ");
        int perDeath = death(scanner.nextInt(), years);
        System.out.print("Enter how many seconds per immigrant: ");
        int perImmigrant = immmigrant(scanner.nextInt(), years);

        for (int i = 0; i < years; i++) {

            newPopulation = population + perBirth;
            newPopulation = newPopulation - (perDeath + perImmigrant);
        }

        System.out.println("Population before: " + population);
        System.out.println("Population after: " + newPopulation);

        System.out.print("Birth: " + perBirth + "\n" + "Death: " + perDeath + "\n" + "Immirgants: " + perImmigrant);
    }

    public static long secInYear(int years) {
        return (years * 365 * 24 * 60 * 60);
    }

    // one birth every sec
    public static int birth(int birth, int years) {
        int birthNum = 0;
        for (int i = 0; i <= secInYear(years) ; i += birth) {
            birthNum++;
        }
        return birthNum;
    }

    // one death every sec
    public static int death(int death, int years) {
        int deathNum = 0;
        for (int i = 0; i <= secInYear(years); i += death) {
            deathNum++;
        }
        return deathNum;
    }

    // one immigrant every sec
    public static int immmigrant(int immigrant, int years) {
        int immigrantNum = 0;
        for (int i = 0; i <= secInYear(years); i += immigrant) {
            immigrantNum++;
        }
        return immigrantNum;
    }
}
