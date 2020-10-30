package com.company;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (!s1.equals(s2))
            System.out.println(s1 + " " + s2);
        else
            System.out.println("Sunt identice");
    }
}
