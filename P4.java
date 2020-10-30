package com.company;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int number1 = scanners.nextInt();
        int number2 = scanners.nextInt();

        if ((number1 * number2) % 3 == 0)
            System.out.println("Este divizibil cu 3");
        if ((number1 * number2) % 5 == 0)
            System.out.println("Este divizibil cu 5");
        if ((number1 * number2) % 3 == 0 && (number1 * number2) % 5 == 0)
            System.out.println("Este divizibil cu 3 si 5");
    }
}
