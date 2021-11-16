package com.harsh.Assign01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0, num = 0;
        while(num != 'x') {
            System.out.println("Enter a number or x to exit");
            num = sc.next().charAt(0);
            if(num != 'x') {
                sum += num;
            }
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}