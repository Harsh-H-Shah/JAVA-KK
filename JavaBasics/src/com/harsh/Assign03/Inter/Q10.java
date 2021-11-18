package com.harsh.Assign03.Inter;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle, rate and years: ");
        double p = sc.nextDouble();
        float r = sc.nextFloat();
        int y = sc.nextInt();
        double interest=0;
        for(int i=1;i<=y;i++){
            interest = p*r/100;
            p = p+interest;
        }
        System.out.println("The compound interest is: "+interest);
    }
}