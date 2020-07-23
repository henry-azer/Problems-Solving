package com.Projects;

public class MultiplicationTable {
      
    public static void main(String[] args) {
        System.out.println("\t\t\t\tMultiplication Table" + "\n" + "\t\t\t" + "---------------------------------");
        numsYAxis();
        numsXAxis();
        
    }
    
    public static void numsXAxis() {
        System.out.print("\n");
            multi();
    }
    
    public static void numsYAxis() {
        for (int i = 1; i <= 12; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\n" + "---------------------------------------------------");
    }
    
    public static void multi() {
        for (int i = 1; i <= 12; i++) {      
            System.out.print(i + "|" + "\t");        
            int num;
            for (int k = 1; k <= 1; k++) {
                for (int j = 1; j <= 12; j++) {
                    num = i * j;
                    System.out.print(num + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}