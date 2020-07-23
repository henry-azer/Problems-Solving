package com.Projects;

import java.util.Scanner;

public class AreaAndPerimeterAndVolumeOfACircle {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Input the radius: ");
            double radius = input.nextInt();

            if (radius == 0 )
                throw new IllegalArgumentException();

            double perimeter = (2 * 3.14 * radius);
            double area = (radius * radius * 3.14);
            double volume = (area * radius);

            System.out.println("Perimeter = " + perimeter);
            System.out.println("Area = " + area);
            System.out.println("Volume = " + volume);

        }
}
