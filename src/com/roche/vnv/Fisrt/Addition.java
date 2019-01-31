package com.roche.vnv.Fisrt;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to add:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("El resultado es: " + (a + b));

    }

}
