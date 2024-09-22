package Lab2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the minets : ");
        int min=i.nextInt();
        int tday=(int)(min)/(60*24);
        int years=(int) tday/365;
        int day=(int)tday-365;
     
        
        System.out.println("Years = "+years+" , Days ="+day);
    }
    
}
