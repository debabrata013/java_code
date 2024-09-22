package lab4;

import java.util.Scanner;

public class Q4 {

    static int  bin(int key, int arr[],int s,int e){
        int idx=-1;
        if(s>e||e<s){
return idx;
        }
    
        int mid=(s+e)/2;
        if(arr[mid]==key){
            return mid;
        } if(arr[mid]>key){
            s=mid+1;
        bin(key,arr,s,e);

        }if(arr[mid]<key){
            e=mid-1;
        bin(key,arr,s,e);

        }

        return idx;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 10 element in sorted order :");
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=s.nextInt();
        }System.out.print("Enter the element to find : ");
        int key=s.nextInt();
        int idx=bin(key,a,0,9);
        if(idx==-1){
            System.out.println("Element not present!");
        }else {
            System.out.println("Element found at index :"+idx);
        } }
    
}
