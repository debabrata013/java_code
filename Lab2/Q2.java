package Lab2;

import java.util.Scanner;



public class Q2 {
    public static void main(String[] args) {
        
        // claculate the bmi  = weight( kg) / height * height
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the weight in kg : ");
        double wight = i.nextDouble();
         System.out.print("Enter the hight : ");
         double height = i.nextDouble();
         double BMI = (wight/(height*height));
          System.out.println("The BMI = "+BMI);
    }
    
}
