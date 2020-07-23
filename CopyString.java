package com.ProblemSolving;

public class CopyString {

    public static void main(String[] args) {
        String one = "Hello World";

        char[] ch1 = one.toCharArray();
        char[] ch2 = new char[ch1.length];

        copyStringIterative(ch1, ch2);
        System.out.println(ch2);
    }

    public static void copyStringIterative(char[] ch1, char[] ch2) {
        int i = 0;
        for (i = 0; i < ch1.length; i++)
            ch2[i] = ch1[i];
    }
}
