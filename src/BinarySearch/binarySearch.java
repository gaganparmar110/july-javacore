package BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] array={12,24,36,45,56,66};
        int i;
        int len=array.length;
        int b=len/2;
        System.out.print("Array:");
        for (i=0;i<len;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("enter a integer from array:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (i=0;i<len;i++) {
            if (array[b]==a) {
                for (i=0;i<len;i++){
                    if (array[i]==0){

                    }
                }
            }
        }
        }

    }

