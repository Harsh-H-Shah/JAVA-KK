package com.harsh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // type conversion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        float b = a;
        System.out.println(b);
        // type casting
        int c = (int) b;
        System.out.println(c);
        // automatic type promotion in expression
        int d = 257;
        byte e = (byte) d; // 257 is promoted to byte as 257%256 = 1
        System.out.println(e);
        // automatic type promotion in assignment
        byte f = 127;
        byte g = 30;
        int h = f * g; // 127*30 = 3840 but it converts to int as byte cannot hold 3840

        int num = 'A';
        System.out.println(num); // prints 65
        // automatic type promotion rules:
        // 1. byte, short, char promotes to int
        // 2. int, long promotes to long
        // 3. float, double promotes to double

        System.out.println("नमस्ते"); // proof java is unicode aware
    }
}