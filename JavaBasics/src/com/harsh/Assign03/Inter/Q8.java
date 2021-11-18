package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the runs,matches and not-outs: ");
        int runs = sc.nextInt();
        int matches = sc.nextInt();
        int notouts = sc.nextInt();
        int out = matches - notouts;
        int avg = (runs) / out;
        System.out.println("Average runs per match: " + avg);
    }
}