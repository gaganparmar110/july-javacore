package FabonacciSeries;

import java.util.Scanner;

public class fabonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=0,q=1,sum;
        for (int i=0;i<a;i++){
            sum=p+q;
            p=q;
            q=sum;
            System.out.print(+sum+" ");
        }
    }
}
