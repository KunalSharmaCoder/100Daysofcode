package com.HundredDays;

import java.util.Scanner;

public class Day6of100 {

    public static void paterns() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n ; i++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }




    public static void patern1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }




    public static void patern2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }



    public static void patern3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();


        }

    }
}
