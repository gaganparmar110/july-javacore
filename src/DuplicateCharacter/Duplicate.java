package DuplicateCharacter;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
          System.out.println("ENTER A String");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] ch=a.toCharArray();
        for (int i=0;i<a.length();i++){
            for (int j=1+i;j<a.length();j++){
                if (ch[i]==ch[j]){
              System.out.println("duplicate letter is: "+ch[i]);
              break;
                }
            }
        }
    }
}
