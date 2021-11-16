package com.harsh.Assign02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle, rate and time: ");
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();
        float si = (principal * rate * time) / 100;
        System.out.println(si);
    }
}