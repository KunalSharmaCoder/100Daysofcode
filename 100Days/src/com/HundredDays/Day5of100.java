package com.HundredDays;

import java.util.Scanner;

public class Day5of100 {
    public static void nestedFor(){
        for (int j = 1; j <=20 ; j++) {
            int tableof = j;
            for (int i = 1; i <= 10; i++) {
                System.out.print(tableof * i +" ");

            }
            System.out.println();
        }
    }}
