package Lab6;

import java.util.Scanner;

public class Q3 {
  
    static int ractangle(int l,int b){
        return l*b;
       

    }
    int squre(int a){
        return a*a;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner( System.in); Q3 f= new Q3();
               System.out.println("Enter the length and breath of rectangle");
               int l=sc.nextInt(),b=sc.nextInt();
              System.out.println("ractangel area "+ ractangle(l, b));
              System.out.println("Enter side of squre ");
              int a=sc.nextInt();
               System.out.println("squre area "+ f.squre(a));
        
    }
    
}
