package com.company;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nume1 = scanner.nextLine();
        String nume2 = scanner.nextLine();
        if (nume1.equals(nume2)) {
            System.out.println("Introduceti nr de la tastatura: ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int sum = number1 + number2;
            if (number1 % 2 == 0)
                System.out.println("nr 1 e par");
            if (number2 % 2 == 1)
                System.out.println("nr 2 e impar");
            if (number1 % 2 == 0 && number2 % 2 == 0 && sum >= number3)
                System.out.println("Suma numerelor " + number1 + " + " + number2 + " este mai mare sau egala ca " + number3);
        } else
            System.out.println("Cele 2 stringuri nu sunt identice.");
    }
}
