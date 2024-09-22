package Lab2;

import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.println("Enter the Length , Height , Width in miter :");
        double l=i.nextDouble();
        double b =i.nextDouble();
        double h=i.nextDouble();
        double vol = l*b*h;
        System.out.println("Volume of cube = "+vol+" m³");
        System.out.println("Volume of cuboid = "+vol+" m³");
    }
    
}
