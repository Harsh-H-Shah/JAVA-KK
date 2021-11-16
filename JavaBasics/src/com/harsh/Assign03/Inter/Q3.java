package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers: ");
        int n = sc.nextInt();
        float sum = 0, avg = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            float num = sc.nextFloat();
            sum = sum + num;
        }
        avg = sum / n;
        System.out.println("The average is: " + avg);
    }
}