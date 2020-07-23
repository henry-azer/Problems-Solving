package com.ProblemSolving;

public class CountX {

    public static void main(String[] args) {
        System.out.println(countXIterative("XHello x x"));
        System.out.println(countXRecursion("XHello x x"));
    }

    public static int countXIterative(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'X' || string.charAt(i) == 'x')
                count++;
        }

        return count;
    }

    public static int countXRecursion(String string) {
        if (string.length() == 0)
            return 0;

        if (string.charAt(0) == 'X' || string.charAt(0) == 'x')
            return 1 + countXRecursion(string.substring(1));

        return countXRecursion(string.substring(1));
    }
}
