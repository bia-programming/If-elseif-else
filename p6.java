package com.company;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int number = scanners.nextInt();
        if (number > 0)
            System.out.println("Numarul este pozitiv");
        else if (number < 0)
            System.out.println("Numarul este negativ");
        else
            System.out.println("Numarul este 0");
    }
}
