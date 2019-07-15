package SwitchCase;


import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("enter your choice from  [1] + ,[2] - ,[3] * ,[4] / : ");
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int a,b,c;
        switch(q) {
            case 1:{
                System.out.println("enter value of a=");
                a=sc.nextInt();
                System.out.println("enter value of b=");
                b=sc.nextInt();
                c=a+b;
                System.out.println("sum of a and b is : "+c);
                break;
            }
            case 2:{
                System.out.println("enter value of a=");
                a=sc.nextInt();
                System.out.println("enter value of b=");
                b=sc.nextInt();
                c=a-b;
                System.out.println("substraction of a and b is : "+c);
                break;
            }
            case 3:{
                System.out.println("enter value of a=");
                a=sc.nextInt();
                System.out.println("enter value of b=");
                b=sc.nextInt();
                c=a*b;
                System.out.println("multiplication of a and b is : "+c);
                break;
            }
            case 4:{
                System.out.println("enter value of a=");
                a=sc.nextInt();
                System.out.println("enter value of b=");
                b=sc.nextInt();
                c=a/b;
                System.out.println("division of a and b is : "+c);
                break;
            }
            default:{
                System.out.println("invalid choice ");
            }


        }

    }
}
