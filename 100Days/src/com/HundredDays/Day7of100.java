package com.HundredDays;

import java.util.Scanner;

public class Day7of100 {
    public static void palindrome() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp=n;
    int reversedNumber = 0;
    while(temp>0){
        int lastDigit= temp % 10;
        reversedNumber=reversedNumber* 10 + lastDigit;
        temp/=10;
        }
            if(reversedNumber == n){
                System.out.println(n + " is palindrome");
            }else{
                System.out.println(n +" is not palindrome");
            }
      }



public static void averageMarksOfStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int marks[]= new int[n];
    for (int i = 0; i <n ; i++) {
        marks[i]= sc.nextInt();
        
    }
    int averageMarks = 0;
    for (int i = 0; i < n; i++) {
        averageMarks += marks[i];
        
    }
    averageMarks/=n;
    System.out.println("the average marks are"+averageMarks);
}

}
