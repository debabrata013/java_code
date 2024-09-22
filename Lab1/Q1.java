package Lab1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int ae[]= new int[100];
        System.out.println("Enter the number of rows");
        int size=i.nextInt();
        System.out.print("Enter the array element :");
        for (int j = 0 ;j<size;++j){
             ae[j]=i.nextInt();
        }
        System.out.println("The array elements are :");
        for (int j = 0 ;j >= size;++j){
           System.out.println(ae[j]);
        }
    }
    
}
