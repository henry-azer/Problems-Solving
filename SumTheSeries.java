package com.Projects;

public class SumTheSeries {

    public static void main(String[] args) {
        
        double sum = 0.0;
        for (double i = 1.0; i < 97.0 ; i += 2) {
            sum += i / (i + 2);
        }
        System.out.println(
                "Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " +
                        " ... + 95 / 97 + 97 / 99");
        System.out.println("Sum of series: " + sum);
    }
}
