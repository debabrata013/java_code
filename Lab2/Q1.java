package Lab2;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
      Scanner i= new Scanner(System.in);
      System.out.println("Enter the number between (100 - 999)");
      int a= i.nextInt();
     
        int sum = a%10;
        a/=10;
        sum +=a%10;
        a/=10;
        sum +=a%10;
        a/=10;
        System.out.println("The sum of all the numbers is ="+sum);
    

    }
    
}