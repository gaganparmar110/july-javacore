package reverseNumber;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int len=String.valueOf(a).length();
        System.out.println("before reverse: "+a);
        int[] b=new int[a];
        int i;
        for (i=0;a!=0;i++){
            b[i]=a%10;//371%10=1
                a=a/10;//371/10=37
        }
        System.out.print("after reverse: ");
        for (i=0;i<len;i++)
        System.out.print(b[i]);
    }
}
