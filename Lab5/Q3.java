package Lab5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k =new Scanner( System.in);
        System.out.print("Enter number of element :");
               int a=k.nextInt();
               System.out.print("Enetr the array elements :");
               int arr[]=new int [a];
                     for (int i=0;i<arr.length;i++){
                arr[i]=k.nextInt();
    }
    int mx=arr[0],mn=arr[0];
    for(int i=0;i<a;i++){
        if(mx<(arr[i])){
            mx=arr[i];
    }if(mn>arr[i]){
        mn=arr[i] ;
    }    }
    System.out.print("\nMaximum value is "+mx+"\nMinimum Value is"+mn );
    
}}
