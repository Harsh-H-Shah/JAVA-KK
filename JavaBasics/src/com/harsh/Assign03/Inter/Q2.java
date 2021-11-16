package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed: ");
        int units = sc.nextInt();
        float bill = 0;
        if (units <= 50) {
            bill = units * 1.5f;
        }
        else if (units <= 100) {
            bill = 50 * 1.5f + (units - 50) * 2f;
        }
        else if (units <= 200) {
            bill = 50 * 1.5f + 50 * 2f + (units - 100) * 2.5f;
        }
        else {
            bill = 50 * 1.5f + 50 * 2f + 100 * 2.5f + (units - 200) * 3.5f;
        }
        System.out.println("The bill is: " + bill);
    }
}