package armStrongNumber;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int a=temp;
        int sum=0;
        for(int i=0;a!=0;i++){
            int b=a%10;   //371%10 = 1;
                a=a/10;   //371/10 = 37;
            int cube=b*b*b;
            sum=sum+cube;
        }
        if (sum==temp){
            System.out.println("it is a ArmStrong Number");
        }
        else System.out.println("not a ArmStrong Number");
    }
}
