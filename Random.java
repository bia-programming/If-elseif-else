package com.company;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 7 + 1);
        System.out.println(random);
        if (random == 1)
            System.out.println("luni");
        else if (random == 2)
            System.out.println("marti");
        else if ( random == 3)
            System.out.println("miercuri");
        else if (random == 4)
            System.out.println("joi");
        else if (random == 5)
            System.out.println("vineri");
        else if (random == 6)
            System.out.println("sambata");
        else if (random == 7)
            System.out.println("duminica");
        else
            System.out.println("incorect");
    }
}
