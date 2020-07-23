package com.Projects;

public class ASCIICharacterTable {

    public static void main(String[] args) {
        System.out.println("\t\t\t\tASCII Characters Table" + "\n" +
                "\t\t\t" + "---------------------------------");
        System.out.println("  Decimal  \t\tHexDecimal\t\t   Octal\t\t\tCharacter");

        for (int i = 33; i <= 126; i++) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("\t" + i + "\t\t\t\t" + Integer.toHexString(i) +
                     "\t\t\t\t" + Integer.toOctalString(i) + "\t\t\t\t\t"  + (char) i );
        }
        System.out.println("------------------------------------------------------------------");

    }
}
