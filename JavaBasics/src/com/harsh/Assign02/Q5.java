package com.harsh.Assign02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("The largest of the two numbers is: "+Math.max(a,b));
    }
}