package com.harsh;

import java.util.Scanner;

public class TempProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.print("Temperature in Fahrenheit is " + tempF);
    }
}