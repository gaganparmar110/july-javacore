package Primeno;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count = 0;
        for (int i=1;i<=a;i++) {
            int b = a % i;
            if (b == 0) {
                count++;
            }
        }
        if (count==2){
            System.out.println("Number Is Prime");
        }
        else System.out.println("Number is not prime");
        }
       }
    /*
    a=11- 1 and 11
    i=1,2
         11%1=0
         11%2=1
         11%11=0
     */

