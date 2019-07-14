package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=1,m=0;
        for (int i=a;i>=1;i--){
            m=p*i;
            p=m;
        }
        System.out.println(+m);
    }
}
/*
    5!=1*2*3*4*5
      =120
 */
