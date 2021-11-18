package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        System.out.println("Enter the time in years: ");
        int t = sc.nextInt();
        double depreciation;
        if (t<=5) {
            depreciation = (n * t * 0.1) / 100;
        }
        else if (t<=10) {
            depreciation = (n * 5 * 0.1) / 100 + (n * (t - 5) * 0.2) / 100;
        }
        else {
            depreciation = (n * 5 * 0.1) / 100 + (n * 5 * 0.2) / 100 + (n * (t - 10) * 0.3) / 100;
        }
        System.out.println("The depreciation is: "+depreciation);
    }
}