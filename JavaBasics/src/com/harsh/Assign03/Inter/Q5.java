package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the coordinates of the second point");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        float distance = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the two points is " + distance);
    }
}