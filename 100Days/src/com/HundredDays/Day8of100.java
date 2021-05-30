package com.HundredDays;

import java.util.Scanner;

public class Day8of100 {
    public static void TwoDimensionalArr(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Dimensions: ");
        int rows = sc.nextInt();
        int coulmns = sc.nextInt();
        int a[][]= new int[rows][coulmns];
        int b[][]= new int[rows][coulmns];
        System.out.println("Enter The Array a: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < coulmns; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter The Array b: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < coulmns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[rows][coulmns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coulmns; j++) {
                c[i][j]=a[i][j] +b[i][j];

            }
            
        }
        System.out.println("The Result c is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coulmns; j++) {
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }


public static void Bubblesorting(){
        int a[] ={1,5,6,-5,4,3};
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            boolean sorted =true;
           for (int j = 0; j < n-1; j++) {
               if (a[j+1] < a[j]){
                  int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                    sorted= false;
              }

           }
           if (sorted) break;

       }
        for(int item: a){
            System.out.print(item+" ");
   }


    }



   public static void Selectionsort(int[] a){
     //   int a[]={1,5,2,-7,8};
        int n = a.length;
        for (int i = 0; i <= n-1; i++) {
           int minInd=i;
           for (int j = i; j <n ; j++) {
               if (a[j] < a[minInd]){
                minInd= j ;
               }
           }
           int temp =a[i];
           a[i]=a[minInd];
           a[minInd]=temp;
       }
       for (int j : a) {
           System.out.print(j + " ");
       }






   }

}
