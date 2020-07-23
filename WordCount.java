package com.Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file);

        try{
            System.out.println(file.exists());
            //openFile("words.txt");
            //array[index]++;
        } catch(IndexOutOfBoundsException exception) {
            throw new IndexOutOfBoundsException();
        }

        long wordCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            wordCount += line.split(" ").length;
        }

        System.out.println("The file contains '" + wordCount + "' words.");
    }
}
