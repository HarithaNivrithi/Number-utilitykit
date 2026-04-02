package com.example;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);
        
        int reverse = 0;
        temp = num;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Reverse: " + reverse);
        System.out.println(“Number Utility Kit Running in Jenkins”);
    }
}
