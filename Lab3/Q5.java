package Lab3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.print("Enetr a character ");
        char ch1=i.next().charAt(0);
        switch(ch1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
             System.out.println("The  Entered character is vowel.");
             break;
             default:
             System.out.println("The entered character is Consonant");
            
        }
    }
    
}
