package Lab5;

import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n=i.nextInt();
        System.out.print("Enter the elements : ");
        int a[ ] = new int [n];
        double avg=0;
        for (int j=0 ;j<a.length;++j){
            a[j]=i.nextInt();}
                   for (int k:a )
                   { avg+=k;

                   }
                   avg/=n;
                   System.out.print("The average of array elements : "+avg);

     }
    
}
