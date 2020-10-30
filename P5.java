package com.company;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nume1 = scanner.nextLine();
        String nume2 = scanner.nextLine();
        if (!nume1.equals(nume2))
            System.out.println("Numele sunt diferite");
        else
            System.out.println(nume1 + " " + nume2);
    }
}
