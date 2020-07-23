package com.Projects;

import java.util.Random;

public class RandomCharacter {

    public static void main(String[] args) {
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'A');

        System.out.println(c);

    }
}
