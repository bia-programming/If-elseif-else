package com.company;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracter = scanner.nextLine();
        char op = caracter.charAt(0);
        if (op > '0' && op <= '9')
            System.out.println("numar");
        else if (op > 'a' && op < 'z' || op > 'A' && op < 'Z')
            System.out.println("litera");
        else
            System.out.println("Caracter special");
    }
}
