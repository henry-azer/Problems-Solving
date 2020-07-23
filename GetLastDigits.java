package com.Projects;

import java.util.LinkedList;

public class GetLastDigits {

    public static void main(String[] args) {
        System.out.println(getSuffix(123413215, 3));

    }

    public static int getSuffix(int value, int numberOfDigits) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (value > 0 && numberOfDigits != 0) {
            stack.push(value % 10);
            value = value / 10;
            numberOfDigits--;
        }

        Object[] arr = stack.toArray();
        StringBuilder builder = new StringBuilder();
        for (Object i : arr) {
            builder.append(i);
        }

        return Integer.parseInt(builder.toString());
    }
}

