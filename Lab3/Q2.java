package Lab3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.print("Enter  two floating=-point numbers : ");
        float a=i.nextFloat();
        float b=i.nextFloat();
       int a1=(int)(a*1000);
        int b1=(int)(b*1000);
      
        if(a1==b1){
            System.out.print("The enter numbers are same");
        }else{
            System.out.println("The entered numbers are not same");

        }
    }
    
}
