package com.HundredDays;

import java.util.Scanner;

public class Day4of100 {

    public static void factorial(int n){
        int factorial =1;
        for (int i = 1; i <=n ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void fabinocci() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
    }



}