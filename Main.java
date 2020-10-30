package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nr1: ");
        float var1 = scanner.nextFloat();
        System.out.println("nr2: ");
        float var2 = scanner.nextFloat();
        System.out.println("|| Welcome ||");
        System.out.println("1.The Sum of numbers");
        System.out.println("2.The difference between numbers");
        System.out.println("3.The product of numbers");
        System.out.println("4.The division of numbers");
        System.out.println("5.The rest of the division of numbers");
        System.out.println("6.Exit");
        System.out.println("Varianta din meniu sau operator matematic: ");
        String choice = scanner.nextLine();
        char op = choice.charAt(0);
        try {
            System.out.println("|| Welcome ||");
            System.out.println("1.The Sum of numbers");
            System.out.println("2.The difference between numbers");
            System.out.println("3.The product of numbers");
            System.out.println("4.The division of numbers");
            System.out.println("5.The rest of the division of numbers");
            System.out.println("6.Exit");

            if (op == '+' || op == '1')
                System.out.println("sum: " + (var1 + var2));
            else if (op == '-' || op == '2')
                System.out.println("difference: " + (var1 - var2));
            else if (op == '*' || op == '3')
                System.out.println("product: " + (var1 * var2));
            else if (op == '/' || op == '4')
                System.out.println("division: " + (var1 / var2));
            else if (op == '%' || op == '5')
                System.out.println("rest: " + (var1 % var2));
            else if(op=='6')
                System.out.println("exit");
        } catch (Exception e){
            System.out.println("caracter incorect");
        }
    }
}
