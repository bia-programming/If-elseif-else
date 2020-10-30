package com.company;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int salut = scanners.nextInt();
        if (salut <= 11)
            System.out.println("buna dimineata");
        else if (salut > 11 && salut < 18)
            System.out.println("buna ziua");
        else if (salut >= 18)
            System.out.println("buna seara");
        else if (salut > 22 && salut < 24)
            System.out.println("la somn");
    }
}
