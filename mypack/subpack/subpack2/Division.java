package mypack.subpack.subpack2;

import java.util.Scanner;

/**
 * Division
 */
public class Division {
    Scanner a=new Scanner(System.in);

public int div(){
    int num1,num2,division;
System.out.println("Enter the first number");
num1 =a.nextInt();
System.out.println("Enter the second number");
num2 =a.nextInt();
// if (num2!=0) {
//     division = num1 / num2;
// } else{
//     System.out.print("Error! Cannot divide by zero.");
//     return 0;}
// return division;
 division = num1 / num2;
 System.out.println("division "+division);
division=num1 + num2;
System.out.println("addition "+division);
division=num1 - num2;
System.out.println("subtraction"+division);

return num1 / num2;

}

}
    
