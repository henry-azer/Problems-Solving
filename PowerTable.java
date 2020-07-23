package com.Projects;

public class PowerTable {

    public static void main(String[] args) {
        int b = 2;

        System.out.println("a\tb\tpow(a, b)");

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + "\t" + b + "\t" + (int) Math.pow(i, b));
            b++;
        }
    }
}
