package com.roche.vnv.first;

import java.util.Scanner;

public class Addition {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Suma");
            System.out.println("a: ");
            double a = readFrom(scan);
            System.out.println("b: ");
            double b = readFrom(scan);

            Suma(a, b);
        }

    private static double readFrom(Scanner scan) {
        return scan.nextDouble();
    }

    private static void Suma(double a, double b) {
        double result;
        result = a+b;

        System.out.println("result: " + result);
    }


}