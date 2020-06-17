package com.dmytrolystovets;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplier = 2;
        System.out.print(1);
        while (multiplier <= Math.sqrt(number)) {
            while (number % multiplier == 0) {
                System.out.print(", " + multiplier);
                number /= multiplier;
            }
            if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (number != 1) {
            System.out.print(", " + number);
        }


    }
}
