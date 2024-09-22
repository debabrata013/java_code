package Lab2;

import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
                Scanner i= new Scanner(System.in);

        System.out.println("Enter the number :");
        int x=i.nextInt();
        int a= x>>3, b= x<<2;
        System.out.println(x+">>3 = "+a);
        System.out.println(x+"<<2 = "+b);
    }
    
}
