package ReverseNumber;

import java.util.Scanner;

public class Reverse {
    void forloop(){
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
    void whileloop() {
        System.out.println("");
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int len = String.valueOf(a).length();
        System.out.println("before reverse: " + a);
        int[] b = new int[a];
        int i = 0;
        while (a != 0) {
            b[i] = a % 10;//371%10=1
            a = a / 10;//371/10=37
            ++i;
        }
        System.out.print("after reverse: ");
        int j=0;
        while (j < len) {
            System.out.print(b[j]);
            ++j;
        }
    }
    public static void main(String[] args) {
       Reverse re=new Reverse();
       re.forloop();
       re.whileloop();
    }
}
