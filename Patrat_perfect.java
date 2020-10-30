package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Patrat_perfect {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int number1 = scanners.nextInt();
        if (sqrt(number1) == (int)(sqrt(number1)))
            System.out.println("patrat perfect");
    }
}
