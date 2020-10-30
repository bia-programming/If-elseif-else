package com.company;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int sum2 = 0, sum3 = 0;
        if (nr % 2 == 0 && nr % 3 == 0){
            for (int i = 1; i <= nr; i++) {
                if ((i * 2) < nr)
                    sum2 = sum2 + (i * 2);
                if ((i * 3) < nr)
                    sum3 = sum3 + (i * 3);
            }
        System.out.println("sum:" + (sum2 + sum3));}
        else if (nr % 2 == 0)
            System.out.println("div cu 2: " + nr / 2);
        else if (nr % 2 == 1 && nr % 3 == 1)
            System.out.println("nu e div nici cu 2, nici cu 3");
    }
}
