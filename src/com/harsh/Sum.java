package com.harsh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers to add them: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));
    }
}
