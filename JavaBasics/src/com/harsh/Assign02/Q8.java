package com.harsh.Assign02;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check whether it's palindrome: ");
        String str = sc.nextLine();
        String rstr = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            rstr = c + rstr;
        }
        if(str.equals(rstr)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
    }
}