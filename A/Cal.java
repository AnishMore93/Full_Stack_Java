package com.A;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select operation (1, 2, 3, 4): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '1':
                result = num1 + num2;
                break;
            case '2':
                result = num1 - num2;
                break;
            case '3':
                result = num1 * num2;
                break;
            case '4':
            	result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
