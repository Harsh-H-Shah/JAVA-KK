package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales: ");
        int sales = sc.nextInt();
        if (sales >= 0 && sales <= 10000) {
            System.out.println("The commission is: " + (sales * 0.1));
        }
        else if (sales >= 10001 && sales <= 20000) {
            System.out.println("The commission is: " + (sales * 0.15));
        }
        else if (sales >= 20001 && sales <= 30000) {
            System.out.println("The commission is: " + (sales * 0.2));
        }
        else {
            System.out.println("The commission is: " + (sales * 0.25));
        }
    }
}