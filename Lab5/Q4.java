package Lab5;

import java.util.Scanner;

public class Q4 {
    static boolean check(int[] arr2,int size,int curr){
        for(int i=0;i<size;i++){
            if(curr==arr2[i]){
                return false;
            }
        }
         
 return true;
    }
    public static void main(String[] args) {
         Scanner k =new Scanner( System.in);
        System.out.print("Enter number of element :");
               int a=k.nextInt();
               System.out.print("Enetr the array elements :");
               int arr[]=new int [a];
                     for (int i=0;i<arr.length;i++){
                arr[i]=k.nextInt();
    }
    int[] arr2= new int[a];int j=0;
    for(int i=0;i<a;i++){
        int curr=arr[i];
        for(int l=i+1;l<a;l++){


if( check(arr2,j,curr)){
if(arr[l]==curr  ){
                System.out.println("Duplicate element :"+arr[i]);
                arr2[j]=curr;j++;
            }
        }}
    }
   
    }
    
}
