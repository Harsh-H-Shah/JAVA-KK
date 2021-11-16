package com.harsh.Assign02;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupees: ");
        double rupees = sc.nextDouble();
        System.out.println("The currency in dollars is " + (float)(rupees / 74.0));
    }
}