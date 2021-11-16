package com.harsh.Assign02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1. + for addition\n2. - for subtraction\n3. * for multiplication\n4. / for division\n Enter the operator: ");
        char c = sc.next().charAt(0);
        if(c == '+') {
            System.out.println(a + b);
        }
        else if(c == '-') {
            System.out.println(a - b);
        }
        else if(c == '*') {
            System.out.println(a * b);}
        else if(c == '/') {
            System.out.println(a / b);
        }
        else {
            System.out.println("Invalid operator");
        }
}
}