package LeapYear;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.print("enter a year: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if ((a%400==0) || (( a%4==0 && a%100!=0))){
               System.out.println("it is a leap year");
            }
       else {
               System.out.println("not a leap year");
             }
        }
     }

