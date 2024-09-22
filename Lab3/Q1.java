package Lab3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
          Scanner i = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = i.nextDouble();
        System.out.print("Enter the value of b: ");
        double b=i.nextDouble();
        System.out.print("Enter the value of c: ");
        double c=i.nextDouble();
       
        double disc = (b * b )- (4 * a * c);
        
        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.print("The roots are !\n");
            System.out.print(" Root 1 = " + root1);
            System.out.print(" \nRoot 2 = " + root2);
        }
        else if ( disc==0){
            double x=(-((b*b)/(a*2)));
            System.out.println(" The roots is = "+x);
        }
        else{
               System.out.println("The roots are imaginary !");
        }

       
        
    }
    
}
