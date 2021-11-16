package com.harsh.Assign02;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two limits of searching: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        while (c <= b) {
            int temp = c;
            int sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }
            if (sum == c) {
                System.out.println(c);
            }
            c++;
        }
        if(c==0){
            System.out.println("No such number exists");
        }
    }
}