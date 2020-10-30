package com.company;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int number = scanners.nextInt();
        if (number % 4 == 0 && number % 2 == 1)
            System.out.println("Numarul este multiplu de 4");
        if (number % 4 == 0 && number % 2 == 0)
            System.out.println("Numarul este multiplu de 2 si 4");
    }
}
