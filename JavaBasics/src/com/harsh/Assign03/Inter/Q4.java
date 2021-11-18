package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        float bill = sc.nextInt();
        float discount = 0;
        if (bill >= 1000) {
            discount = bill * 0.15f;
        }
        else if (bill >= 500) {
            discount = bill * 0.10f;
        }
        else if (bill >= 100) {
            discount = bill * 0.05f;
        }
        else {
            discount = 0;
        }
        System.out.println("Discount: " + discount);
    }
}