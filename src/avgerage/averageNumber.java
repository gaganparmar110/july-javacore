package avgerage;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        System.out.println("no of elements");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[], i = 0;
        a = new int[n];
        System.out.println("elements are:");
        int sum = 0;
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        int avg = sum / n;
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + avg);
    }
}

