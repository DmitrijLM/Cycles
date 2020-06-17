package com.dmytrolystovets;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Делители: \n" + 1);
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(number);

    }
}


