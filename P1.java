package com.company;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul nr: ");
        int nr1 = scanner.nextInt();
        System.out.println("Introduceti al doilea nr: ");
        int nr2 = scanner.nextInt();
        int p = 1, sum = 0;
        if (nr1 % 2 == 0 && nr2 % 2 == 0) {
            sum = nr1 + nr2;
            System.out.println("Suma este: " + sum);
        } else if (nr1 % 2 != 0 && nr2 % 2 == 1) {
            p = nr1 * nr2;
            System.out.println("Produsul este: " + p);
        }
    }
}
