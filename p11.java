package com.company;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int number1 = scanners.nextInt();
        int number2 = scanners.nextInt();
        int number3 = scanners.nextInt();
        int number4 = scanners.nextInt();
        if ((number1 + number2 + number3) % number4 == 0) {
            if (number4 % number1 == 0)
                System.out.println("numarul " + number4 + " este divizibil cu " + number1);
            else if (number4 % number2 == 0)
                System.out.println("numarul " + number4 + " este divizibil cu " + number2);
            else if (number4 % number3 == 0)
                System.out.println("numarul " + number4 + " este divizibil cu " + number3);

        }
    }
}
