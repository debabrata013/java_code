package Lab5;

import java.util.Scanner;

public class Q5 {
    static boolean check(String [] arr2,int size,String curr){
        for(int i=0;i<size;i++){
            if(arr2[i].equals(curr)){
                 System.out.print(curr+" ");
                 return true;
            }
        }
        return false;
        }
        static boolean notPresent(String a[],String curr,int size){
            for(int i=0; i<size;i++){
                if (a[i].equals(curr))
                 return false;

            }
            return true;
        }
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the no. of element :");
        int n=i.nextInt();
        String a []=new String[n];
        String b []=new String[n];
        System.out.println("Enetr element in 1st String : ");
        for(int j=0;j<n;j++){
            a [j]=i.next() ;
        }
        System.out.println("Enetr element in 2nd String : ");
        for(int j=0;j<n;j++){
            b [j]=i.next() ;
        }int k=0;
        String c[]=new String[n];
        for(int j=0;j<n;j++){
          if(notPresent(c, a[j], k))
           if( check(b, n, a[j])){
               c[k]=a[j];
            k++;
           }

        }


    }
    
}
