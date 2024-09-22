package lab4;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
       
        int a[]={20,10,100,80,50,40,30};
        System.out.print("Before sort elements are : ");
        for(int j:a){ System.out.print(j+" ");}
        System.out.println("After sorting the elements are : ");
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//  }
//             }
//         }
Arrays.sort(a);
         for(int j:a){ System.out.print(j+" ");}
    }
    
}
