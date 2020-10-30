package com.company;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxim = 0, sum = 0, c = 0, minim = 999;
        for (int i = 1; i <= 4; i++) {
            int number = scanner.nextInt();
            c++;
            if (c <= 2)
                sum = sum + number;
            if (number > maxim)
                maxim = number;
            if (number < minim)
                minim = number;
        }
        if (maxim % sum == 0)
            System.out.println(maxim);
        else
            System.out.println("maximul si suma primelor 2 nr nu sunt divizibile");

        if (minim % sum == 0)
            System.out.println(minim);
        else
            System.out.println("minimul si suma primelor 2 nr nu sunt divizibile");
    }
}
