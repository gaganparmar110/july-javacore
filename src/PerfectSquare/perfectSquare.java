package PerfectSquare;
import java.util.Scanner;
public class perfectSquare {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();//a=34
        int count = 0;
        double b=Math.sqrt(a);
        System.out.println(b);
        if (b-Math.floor(b)==0){
            System.out.println("it is a perfect square");
        }
        else System.out.println("it is not a perfect square");
    }
    }
