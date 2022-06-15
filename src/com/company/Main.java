package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n>-1 n= ");
        double n = scanner.nextDouble();

        while (n<0)
        {
            System.out.print("Некоректное число, повторите n= ");
            n = scanner.nextDouble();
        }

        System.out.print("x>1 x= ");
        double x = scanner.nextDouble();

        while (x<1)
        {
            System.out.print("Некоректное число, повторите x= ");
            x = scanner.nextDouble();
        }

        double sum = 0;

        for (double i = 0; i< n+1; i++)
        {
            sum += Math.pow(x - 1, 2 * n + 1)/((2*n+1)*Math.pow(x + 1, 2 * n + 1));
        }
        System.out.print(2*sum);
    }
}
