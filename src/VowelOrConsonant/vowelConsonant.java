package VowelOrConsonant;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        System.out.println("enter a letter: ");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String[] letter={"a","e","i","o","u"};
        int count=0;
        for (int i=0;i<5;i++) {
            if (st.equals(letter[i])) {
                 System.out.println("Vowel");
                 count++;
                 break;
            }
        }
        if (count==0){
            System.out.println("Consonant");
        }
    }
}
