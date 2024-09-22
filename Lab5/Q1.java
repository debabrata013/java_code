package Lab5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k =new Scanner( System.in);
        System.out.print("Enter number of element :");
               int a=k.nextInt();
               System.out.print("Enetr the array elements :");
               int arr[]=new int [a];
                     for (int i=0;i<arr.length;i++){
                arr[i]=k.nextInt();
    }
               for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
     }
                }
            }
            System.out.print("after sorting elements are :");
            for (int i:arr){
                System.out.print(i+" ");
    }
    
}
}