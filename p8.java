package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varsta = scanner.nextInt();
        if (varsta < 18)
            System.out.println("sub 18");
        else if (varsta == 18)
            System.out.println("varsta este 18");
        else if (varsta > 18 && varsta < 25)
            System.out.println("varsta este intre 18 si 25");
        else if (varsta > 25 && varsta <= 40)
            System.out.println("varsta este intre 25 si 40");
        else if (varsta > 40 && varsta <= 65)
            System.out.println("varsta este intre 40 si 65");

    }
}
