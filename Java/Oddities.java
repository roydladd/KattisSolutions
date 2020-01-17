package com.roydl.kattis.oddities;

import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {

        int x, num;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            num = scanner.nextInt();
            if (isEven(num)) {
                System.out.println(" is even");
            } else {
                System.out.println(" is odd");
            }
        }
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);

    }
}
