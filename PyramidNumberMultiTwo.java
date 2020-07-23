package com.Projects;

public class PyramidNumberMultiTwo {

    public static void main(String[] args) {

        int count = 0, end = 7;
        for (int i = 1; i <= 128; i += i) {

            for (int start = 0; start < end; start++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= i; j += j) {
                System.out.print(j + "\t");
            }

            for (int r = count; r > 0; r /= 2) {
                System.out.print(r + "\t");
            }
            System.out.println();
            end--;
            count = i;
        }
    }
}
