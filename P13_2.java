package com.company;

import java.util.Scanner;

public class P13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dati ziua");
        int nr = scanner.nextInt();
        if (nr == 1)
            System.out.println("luni");
        else if (nr == 2)
            System.out.println("marti");
        else if (nr == 3)
            System.out.println("miercuri");
        else if (nr == 4)
            System.out.println("joi");
        else if (nr == 5)
            System.out.println("vineri");
        else if (nr == 6)
            System.out.println("sambata");
        else if (nr == 7)
            System.out.println("duminica");
        else
            System.out.println("incorect");
    }
}
