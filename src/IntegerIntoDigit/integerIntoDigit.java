package IntegerIntoDigit;

import java.util.Scanner;

public class integerIntoDigit {
    public static void main(String[] args) {
        System.out.println("enter a integer value: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int len=String.valueOf(a).length();
        int[] b=new int[len];
        int i=0;
        while (a!=0){
            b[i]=a%10;
            i++;
            a=a/10;
        }
        int count=0;
        for (int j=len-1;j>=0;j--){
            count++;
        System.out.println("Digit at place "+count+ ": "+b[j]);
    }
}
}