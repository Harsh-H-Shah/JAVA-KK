package com.harsh.Assign02;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num1=0,num2=1;
        for(int i=1;i<=n;i++){
            System.out.println(num1);
            int nextNum = num1+num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}