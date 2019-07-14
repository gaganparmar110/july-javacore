package com.company.operators;

public class operatorsDemo {
    public static void main(String[] args) {
        int a=13;//a=13
        int b=22;//b=22
        int c=(++a)+(b++);//c=36,a=14,b=23
        int d=(++c)+(b++)+(++a);//d=75,a=15,b=24,c=37
        int e=(++c)+(b++)+(++a)+(d++);//c=38,e=153,b=25,a=16,d=76

        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
    }
}
