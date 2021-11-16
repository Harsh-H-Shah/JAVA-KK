package com.harsh.Assign01;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf=0;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is "+hcf);
        System.out.println("LCM of "+a+" and "+b+" is "+a*b/hcf);
    }
}